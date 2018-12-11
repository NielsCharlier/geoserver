/* (c) 2015 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.metadata.data.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import org.geoserver.config.util.XStreamPersister;
import org.geoserver.config.util.XStreamPersisterInitializer;
import org.springframework.stereotype.Component;

@Component
public class MetadataXStreamInitializer implements XStreamPersisterInitializer {

    @Override
    public void init(XStreamPersister persister) {
        persister.registerBreifMapComplexType("ArrayList", ArrayList.class);
        persister.registerBreifMapComplexType("HashMap", HashMap.class);
        persister.getXStream().alias("ArrayList", ArrayList.class);
        persister.getXStream().alias("HashMap", HashMap.class);
    }
}