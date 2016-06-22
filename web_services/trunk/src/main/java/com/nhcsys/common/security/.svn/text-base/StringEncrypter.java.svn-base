package com.nhcsys.common.security;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Calendar;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import java.util.UUID;
import org.apache.commons.codec.binary.Base64;

public class StringEncrypter
{

    public static final String  DESEDE_ENCRYPTION_SCHEME = "DESede";
    public static final String  DES_ENCRYPTION_SCHEME    = "DES";
    private static final String UNICODE_FORMAT           = "UTF8";
    private KeySpec             keySpec;
    private SecretKeyFactory    keyFactory;
    private Cipher              cipher;

    public StringEncrypter(String encryptionScheme, String encryptionKey)
            throws EncryptionException
    {
        if (encryptionKey == null)
            throw new IllegalArgumentException("encryption key was null");
        if (encryptionKey.trim().length() < 24)
            throw new IllegalArgumentException(
                    "encryption key was less than 24 characters");
        try
        {
            byte[] keyAsBytes = encryptionKey.getBytes(UNICODE_FORMAT);
            if (encryptionScheme.equals(DESEDE_ENCRYPTION_SCHEME))
            {
                keySpec = new DESedeKeySpec(keyAsBytes);
            } else if (encryptionScheme.equals(DES_ENCRYPTION_SCHEME))
            {
                keySpec = new DESKeySpec(keyAsBytes);
            } else
            {
                throw new IllegalArgumentException(
                        "Encryption scheme not supported: " + encryptionScheme);
            }
            keyFactory = SecretKeyFactory.getInstance(encryptionScheme);
            cipher = Cipher.getInstance(encryptionScheme);
        } catch (InvalidKeyException e)
        {
            throw new EncryptionException(e);
        } catch (UnsupportedEncodingException e)
        {
            throw new EncryptionException(e);
        } catch (NoSuchAlgorithmException e)
        {
            throw new EncryptionException(e);
        } catch (NoSuchPaddingException e)
        {
            throw new EncryptionException(e);
        }
    }

    public String encrypt(String unencryptedString) throws EncryptionException
    {
        if (unencryptedString == null || unencryptedString.trim().length() == 0)
            throw new IllegalArgumentException(
                    "unencrypted string was null or empty");
        try
        {
            SecretKey key = keyFactory.generateSecret(keySpec);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cleartext = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] ciphertext = cipher.doFinal(cleartext);
            return new String(Base64.encodeBase64(ciphertext));
        } catch (Exception e)
        {
            throw new EncryptionException(e);
        }
    }

    public String decrypt(String encryptedString) throws EncryptionException
    {
        if (encryptedString == null || encryptedString.trim().length() <= 0)
            throw new IllegalArgumentException(
                    "encrypted string was null or empty");
        try
        {
            SecretKey key = keyFactory.generateSecret(keySpec);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] cleartext = Base64.decodeBase64(encryptedString.getBytes());
            byte[] ciphertext = cipher.doFinal(cleartext);
            
            return bytes2String(ciphertext);
        } catch (Exception e)
        {
            throw new EncryptionException(e);
        }
    }

    private static String bytes2String(byte[] bytes)
    {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bytes.length; i++)
        {
            stringBuffer.append((char) bytes[i]);
        }
        
        return stringBuffer.toString();
    }

    public static class EncryptionException extends Exception
    {

        public EncryptionException(Throwable t)
        {
            super(t);
        }
    }

    public static void main(String[] args) throws Exception
    {
        // this key will be stored in the DB
        String encryptionKey = UUID.randomUUID().toString();
        String encryptionScheme = StringEncrypter.DESEDE_ENCRYPTION_SCHEME;
        StringEncrypter encrypter = new StringEncrypter(encryptionScheme,
                encryptionKey);
        Calendar now = Calendar.getInstance();
        long time = now.getTime().getTime();
        String input = "UserID_MyPassword_CPUSerialNumber_" + time;
        System.out.println("Key            : " + encryptionKey);
        System.out.println("Original Input : " + input);
        String encryptedString = encrypter.encrypt(input);
        System.out.println("Encrypted      : " + encryptedString);
        String decryptedString = encrypter.decrypt(encryptedString);
        System.out.println("Recovered      : " + decryptedString);
        StringTokenizer st = new StringTokenizer(decryptedString, "_");
        int numTokens = st.countTokens();
        // numTokens should be correct, test this
        System.out.println("Id   = " + st.nextToken());
        System.out.println("Pw   = " + st.nextToken());
        System.out.println("CPU  = " + st.nextToken());
        System.out.println("Time = " + st.nextToken());
    }
}
