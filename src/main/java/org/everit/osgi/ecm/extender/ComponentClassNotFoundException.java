/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
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

import org.osgi.framework.wiring.BundleCapability;

/**
 * Thrown when the class could not have been found that was defined in the
 * {@value ECMExtenderConstants#CAPABILITY_NS_COMPONENT} capability.
 */
public class ComponentClassNotFoundException extends RuntimeException {

  private static final long serialVersionUID = -962873461264740334L;

  public ComponentClassNotFoundException(final BundleCapability capability,
      final ClassNotFoundException cause) {
    super("The class defined in capability could not be found: " + capability.toString(), cause);
  }
}
