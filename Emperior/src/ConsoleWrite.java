/*
 * Emperior
 * Copyright 2010 and beyond, Marvin Steinberg.
 *
 * caps is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

class ConsoleWrite implements Runnable
{

    private ConsolePane textArea;

    private String str;

    public ConsoleWrite(ConsolePane textArea, String str)
    {
        this.textArea = textArea;
        this.str = str;
    }

    public void run()
    {
        textArea.addText(str);
    }
}