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
   * Major part of the version of the API that the extender should implement. This constant can be
   * used to generate the capability requirement filter.
   */
  public static final int EXTENDER_API_VERSION_MAJOR = 3;

  /**
   * Minor part of the version of the API that the extender should implement. This constant can be
   * used to generate the capability requirement filter.
   */
  public static final int EXTENDER_API_VERSION_MINOR = 0;

  /**
   * Symbolic name of the ECM Component extender that implements this API.
   */
  public static final String EXTENDER_SYMBOLIC_NAME = "org.everit.osgi.ecm.component";

  /**
   * Attribute for capability requirement that tells which class should be analyzed for annotations.
   */
  public static final String REQUIREMENT_ATTR_CLASS = "class";

  private ECMExtenderConstants() {
  }
}
