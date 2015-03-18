/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.osgi.ecm.extender;

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
   * Namespace of ECM Extender capability. In case a bundle that holds components wires to an
   * extender based on this capability, only that extender will pick up the components that the
   * bundle is wired to.
   */
  public static final String CAPABILITY_NS_EXTENDER = "org.everit.osgi.ecm.extender";

  private ECMExtenderConstants() {
  }
}
