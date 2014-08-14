/*******************************************************************************
 * Copyright (c) 2004-2010 Sunil Kamath (IcemanK). All rights reserved. This
 * program is made available under the terms of the Common Public License v1.0
 * which is available at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors: Sunil Kamath (IcemanK) - initial API and implementation
 *******************************************************************************/

package net.sf.eclipsensis.util.winapi.x64;

import net.sf.eclipsensis.util.winapi.ILongPtr;

public class LongPtr64 implements ILongPtr
{
    long value;

    public LongPtr64(long value)
    {
        this.value = value;
    }

    public Number getValue()
    {
        return value;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (value ^ value >>> 32);
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        LongPtr64 other = (LongPtr64) obj;
        if (value != other.value)
        {
            return false;
        }
        return true;
    }
}
