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
package com.liferay.ide.project.core;

import com.liferay.ide.core.AbstractLiferayProjectProvider;
import com.liferay.ide.project.core.model.NewLiferayPluginProjectOp;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;


/**
 * @author Gregory Amerson
 */
public abstract class NewLiferayProjectProvider extends AbstractLiferayProjectProvider
{

    public NewLiferayProjectProvider( Class<?>[] types )
    {
        super( types );
    }

    public IStatus createNewProject( Object operation, IProgressMonitor monitor ) throws CoreException
    {
        if( ! (operation instanceof NewLiferayPluginProjectOp ) )
        {
            throw new IllegalArgumentException( "Operation must be of type NewLiferayPluginProjectOp" ); //$NON-NLS-1$
        }

        final NewLiferayPluginProjectOp op = NewLiferayPluginProjectOp.class.cast( operation );

        return doCreateNewProject( op, monitor );
    }

    public abstract IStatus doCreateNewProject( final NewLiferayPluginProjectOp op, IProgressMonitor monitor )
        throws CoreException;

    protected String getFrameworkName( NewLiferayPluginProjectOp op )
    {
        final IPortletFramework portletFramework = op.getPortletFramework().content();

        String frameworkName = portletFramework.getShortName();

        if( portletFramework.isRequiresAdvanced() )
        {
            frameworkName = op.getPortletFrameworkAdvanced().content().getShortName();
        }

        return frameworkName;
    }
}
