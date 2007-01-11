/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.googlecode.jsonplugin;

import java.io.IOException;
import java.io.Writer;

/**
 *  Wrapper for JSONWriter with some utility methods.
 */
public class JSONUtil {
    /**
     * Serilizes a object into JSON
     * @param object to be serialized
     * @return JSON string
     * @throws JSONExeption
     */
    public static String serialize(Object object)
        throws JSONExeption {
        JSONWriter writer = new JSONWriter();

        return writer.write(object);
    }

    /**
     * Serilizes a object into JSON to the writer
     * @param writer Writer to serialize the object to
     * @param object object to be serialized
     * @throws IOException
     * @throws JSONExeption
     */
    public static void serialize(Writer writer, Object object)
        throws IOException, JSONExeption {
        writer.write(serialize(object));
    }
}
