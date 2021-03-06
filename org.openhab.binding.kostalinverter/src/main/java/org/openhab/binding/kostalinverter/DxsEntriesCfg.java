/**
 * Copyright (c) 2017-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.kostalinverter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Örjan Backsell
 */
public class DxsEntriesCfg {

    public static String[] getDxsEntriesCfg(String dxsEntriesCfgFile) {
        List<String> dxsEntriesList = new ArrayList<>(23);

        Properties properties = new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream(dxsEntriesCfgFile);
            properties.load(in);
            in.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        dxsEntriesList.add(properties.getProperty("DxsEntries_0"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_1"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_2"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_3"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_4"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_5"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_6"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_7"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_8"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_9"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_10"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_11"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_12"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_13"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_14"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_15"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_16"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_17"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_18"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_19"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_20"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_21"));
        dxsEntriesList.add(properties.getProperty("DxsEntries_22"));

        // Create dxsEntries arrays
        String[] dxsEntries = new String[23];

        dxsEntriesList.toArray(dxsEntries);

        return dxsEntries;
    }
}
