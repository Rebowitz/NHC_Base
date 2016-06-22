package com.nhcsys.dataaccess.nhc.utils;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;

//import com.nhcsys.common.Constants;

public class NhcACLConfig {

	private Properties prop = null;
	private static NhcACLConfig instance = null;

	private NhcACLConfig () {
		
	}
	private void loadProperties() throws Exception {
		InputStream stream = getClass().getClassLoader().getResourceAsStream("resources/nhcaccesscontrol.properties");
		prop = new Properties();
		prop.load(stream);
	}
	public static NhcACLConfig getInstance () throws Exception {
		if (instance == null) {
			instance = new NhcACLConfig();
			instance.loadProperties();
		}
		return instance;
	}
 public Properties getProperties()
 {
    return prop;
 }
 
	public String[] getRoles(String myKey) {
		 String role = null;
		 Enumeration keys = instance.getProperties().keys();
		 String key = null;
		 String roles []  = null;
		 while (keys.hasMoreElements()) {
			 key = (String)keys.nextElement();
			 if (myKey.startsWith(key)) {
				 role = instance.getProperties().getProperty(key);
				 StringTokenizer rolesTokens = new StringTokenizer(role,",");
				 roles = new String[rolesTokens.countTokens()];
				 int index = 0;
				 while (rolesTokens.hasMoreElements()) {
					 roles[index] = rolesTokens.nextToken();
					 index++;
				 }
				 break;
			 }
		 }
		 return roles;
	}
/*	private final static CompositeConfiguration config;

    static
    {
        config = new CompositeConfiguration();
        config.addConfiguration(new SystemConfiguration());

        try
        {
            config.addConfiguration(new PropertiesConfiguration(
                    "nhcaccesscontrol.properties"));
        }
        catch (ConfigurationException e)
        {
            throw new ExceptionInInitializerError(e);
        }
    }
 
    public static void addConfiguration(File propertiesFile)
    throws ConfigurationException
    {
        config.addConfiguration(new PropertiesConfiguration(propertiesFile));
    }

    public static void addConfiguration(String propertiesFile)
    throws ConfigurationException
    {
        config.addConfiguration(new PropertiesConfiguration(propertiesFile));
    }

    public static void addConfiguration(Configuration newConfig)
    {
        config.addConfiguration(newConfig);
    }

    public static Configuration getConfiguration()
    {
        return config;
    } */
}
