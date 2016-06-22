package com.nhcsys.test.common;

import java.io.File;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

import com.nhcsys.test.common.TestConstants;

public class WebServicesTestConfig
{
    private final static CompositeConfiguration config;

    static
    {
        config = new CompositeConfiguration();
        config.addConfiguration(new SystemConfiguration());

        try
        {
            config.addConfiguration(new PropertiesConfiguration(
                    "C:\\WORK\\backbone\\web_services\\trunk\\src\\test\\resources\\config\\"+TestConstants.WEBSERVICES_TEST_CONFIG_FILE));
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
    }
    
}
