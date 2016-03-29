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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.osgi.namespace.extender.ExtenderNamespace;

import aQute.bnd.annotation.headers.RequireCapability;

/**
 * An ECM component class should be annotated with {@link ExtendComponent} if the component should
 * be registered automatically by the ECM extender.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@RequireCapability(ns = ExtenderNamespace.EXTENDER_NAMESPACE,
    filter = "(&(" + ExtenderNamespace.EXTENDER_NAMESPACE + "="
        + ECMExtenderConstants.EXTENDER_SYMBOLIC_NAME + ")("
        + ExtenderNamespace.CAPABILITY_VERSION_ATTRIBUTE + ">="
        + ECMExtenderConstants.EXTENDER_API_VERSION_MAJOR + "."
        + ECMExtenderConstants.EXTENDER_API_VERSION_MINOR + ")(!("
        + ExtenderNamespace.CAPABILITY_VERSION_ATTRIBUTE + ">="
        + (ECMExtenderConstants.EXTENDER_API_VERSION_MAJOR + 1) + ")))",
    extra = ECMExtenderConstants.REQUIREMENT_ATTR_CLASS + "" + "=${@class}")
public @interface ExtendComponent {

}
