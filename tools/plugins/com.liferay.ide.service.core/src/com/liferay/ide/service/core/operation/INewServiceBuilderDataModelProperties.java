/*******************************************************************************
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.service.core.operation;

import org.eclipse.wst.common.componentcore.internal.operation.IArtifactEditOperationDataModelProperties;

/**
 * @author Greg Amerson
 */
@SuppressWarnings( "restriction" )
public interface INewServiceBuilderDataModelProperties extends IArtifactEditOperationDataModelProperties
{

    public static final String AUTHOR = "INewServiceBuilderDataModelProperties.AUTHOR"; //$NON-NLS-1$

    public static final String CREATED_SERVICE_FILE = "INewServiceBuilderDataModelProperties.CREATED_SERVICE_FILE"; //$NON-NLS-1$

    public static final String JAVA_PACKAGE_FRAGMENT_ROOT =
        "INewServiceBuilderDataModelProperties.JAVA_PACKAGE_FRAGMENT_ROOT"; //$NON-NLS-1$

    public static final String JAVA_SOURCE_FOLDER = "INewServiceBuilderDataModelProperties.JAVA_SOURCE_FOLDER"; //$NON-NLS-1$

    public static final String NAMESPACE = "INewServiceBuilderDataModelProperties.NAMESPACE"; //$NON-NLS-1$

    public static final String PACKAGE_PATH = "INewServiceBuilderDataModelProperties.PACKAGE_PATH"; //$NON-NLS-1$

    public static final String SAMPLE_SERVICE_FILE_TEMPLATE = "com.liferay.ide.templates.servicebuilder.sample.file"; //$NON-NLS-1$

    public static final String SERVICE_FILE = "INewServiceBuilderDataModelProperties.SERVICE_FILE"; //$NON-NLS-1$

    public static final String SERVICE_FILE_TEMPLATE = "com.liferay.ide.templates.servicebuilder.file"; //$NON-NLS-1$

    public static final String SOURCE_FOLDER = "INewServiceBuilderDataModelProperties.SOURCE_FOLDER"; //$NON-NLS-1$

    public static final String USE_SAMPLE_TEMPLATE = "INewServiceBuilderDataModelProperties.USE_SAMPLE_TEMPLATE"; //$NON-NLS-1$
}
