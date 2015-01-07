/**
 * This file is part of Everit - ECM Extender API.
 *
 * Everit - ECM Extender API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - ECM Extender API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - ECM Extender API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.ecm.extender.api;

/**
 * Constant values of ECM Extender.
 */
public final class ECMExtenderConstants {

    /**
     * Attribute for component capability that tells which class should be analyzed for annotations.
     */
    public static final String CAPABILITY_ATTR_CLASS = "class";

    /**
     * Namespace of ECM Component capability.
     */
    public static final String CAPABILITY_NS_COMPONENT = "org.everit.osgi.ecm.component";

    /**
     * Namespace of ECM Extender capability. In case a bundle that holds components wires to an extender based on this
     * capability, only that extender will pick up the components that the bundle is wired to.
     */
    public static final String CAPABILITY_NS_EXTENDER = "org.everit.osgi.ecm.extender";

    private ECMExtenderConstants() {
    }
}
