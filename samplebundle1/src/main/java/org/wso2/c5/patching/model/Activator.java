/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.c5.patching.model;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.SynchronousBundleListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kasun on 6/14/17.
 */
public class Activator implements BundleActivator, FrameworkListener, SynchronousBundleListener {

    private static final Logger logger = LoggerFactory.getLogger("Activator.class");

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        logger.info("sample bundle1 is started");
        Bundle[] bundles = bundleContext.getBundles();
        for (int i = 0; i < bundles.length; i++) {
            logger.info(bundles[i].getSymbolicName());
            logger.info("bundle name is printed");

        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        logger.info("sample bundle1 is stopped");
    }

    @Override
    public void bundleChanged(BundleEvent bundleEvent) {
    }

    @Override
    public void frameworkEvent(FrameworkEvent frameworkEvent) {
    }
}
