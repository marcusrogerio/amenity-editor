/**
 * This file is part of Amenity Editor for OSM.
 * Copyright (c) 2001 by Adrian Stabiszewski, as@grundid.de
 *
 * Amenity Editor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Amenity Editor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Amenity Editor.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.osmsurround.ae.search;

public class SearchResult {

	private long nodeId;
	private double lon;
	private double lat;
	private String key;
	private String value;

	public SearchResult(long nodeId, double lon, double lat, String key, String value) {
		this.nodeId = nodeId;
		this.lon = lon;
		this.lat = lat;
		this.key = key;
		this.value = value;
	}

	public long getNodeId() {
		return nodeId;
	}

	public double getLon() {
		return lon;
	}

	public double getLat() {
		return lat;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

}
