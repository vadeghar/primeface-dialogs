package com.primefaces.manager;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;

/**
 * This class is the parent EJB for most of the EJB's defined in the library.
 * The DatabaseSessionManager bean must be populated with the database
 * username/password prior to executing any methods from this class and all
 * sub-classes.
 *
 * @author arollins
 */
@Named
public abstract class InHouseSystemBaseEJB  {

   

    private Map<String, String> getConnectionProperties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("javax.persistence.jdbc.user", "");
        properties.put("javax.persistence.jdbc.password", "");
        properties.put("eclipselink.jdbc.exclusive-connection.mode", "Always");
        properties.put("eclipselink.jdbc.exclusive-connection.is-laxy", "false");
        properties.put("eclipselink.jdbc.batch-writing", "Oracle-JDBC");

        return properties;
    }
}
