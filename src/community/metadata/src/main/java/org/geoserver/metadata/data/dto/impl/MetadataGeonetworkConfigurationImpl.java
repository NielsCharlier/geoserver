/* (c) 2018 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.metadata.data.dto.impl;

import org.geoserver.metadata.data.dto.MetadataGeonetworkConfiguration;

/**
 * Object that matches yaml structure.
 *
 * <p>Describe a geonetwork endpoint.
 *
 * @author Timothy De Bock - timothy.debock.github@gmail.com
 */
public class MetadataGeonetworkConfigurationImpl implements MetadataGeonetworkConfiguration {

    private static final long serialVersionUID = -652210940618705299L;

    String name;

    String url;

    public MetadataGeonetworkConfigurationImpl() {}

    public MetadataGeonetworkConfigurationImpl(String url) {
        this.url = url;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }
}