/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author SXGURIJALA
 */
public class BaseEntity implements Serializable {

    public Object deepClone() {
        Object deepCopy = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            deepCopy = ois.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
           return null;
        } catch (ClassNotFoundException cntfe) {
            cntfe.printStackTrace();
            return null;
        }

        return deepCopy;

    }

}
