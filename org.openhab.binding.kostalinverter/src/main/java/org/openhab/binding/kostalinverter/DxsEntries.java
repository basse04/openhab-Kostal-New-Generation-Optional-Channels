/**
 * Copyright (c) 2017-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.kostalinverter;

/**
 * @author Örjan Backsell
 */
public class DxsEntries {
    private String dxsId;
    private String value;

    public String getId() {
        return dxsId;
    }

    public String getName() {
        return value;
    }
}
