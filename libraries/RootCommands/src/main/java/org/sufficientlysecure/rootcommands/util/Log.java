/*
 * Copyright (C) 2012 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sufficientlysecure.rootcommands.util;

import org.sufficientlysecure.rootcommands.RootCommands;

/**
 * Wraps Android Logging to enable or disable debug output using Constants
 * 
 */
public final class Log {

    public static void v(String tag, String msg) {
        if (RootCommands.DEBUG) {
            RootCommands.logger.debug(tag + " " +msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (RootCommands.DEBUG) {
            RootCommands.logger.debug(tag + " " +msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if (RootCommands.DEBUG) {
            RootCommands.logger.debug(tag + " " +msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (RootCommands.DEBUG) {
            RootCommands.logger.debug(tag + " " +msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        if (RootCommands.DEBUG) {
            RootCommands.logger.info(tag + " " +msg);
        }
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (RootCommands.DEBUG) {
            RootCommands.logger.info(tag + " " +msg, tr);
        }
    }

    public static void w(String tag, String msg) {
        RootCommands.logger.warn(tag + " " +msg);
    }

    public static void w(String tag, String msg, Throwable tr) {
        RootCommands.logger.warn(tag + " " +msg, tr);
    }

    public static void w(String tag, Throwable tr) {
        RootCommands.logger.warn(tag, tr);
    }

    public static void e(String tag, String msg) {
        RootCommands.logger.error(tag + " " +msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        RootCommands.logger.error(tag + " " +msg, tr);
    }

}
