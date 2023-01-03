/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.metrics.prometheus.config;

import org.apache.eventmesh.common.config.Config;
import org.apache.eventmesh.common.config.ConfigFiled;

@Config(prefix = "eventMesh.metrics.prometheus", path = "classPath://prometheus.properties")
public class PrometheusConfiguration {

    @ConfigFiled(field = "port")
    private int eventMeshPrometheusPort = 19090;

    public int getEventMeshPrometheusPort() {
        return this.eventMeshPrometheusPort;
    }

    public void setEventMeshPrometheusPort(int eventMeshPrometheusPort) {
        this.eventMeshPrometheusPort = eventMeshPrometheusPort;
    }
}
