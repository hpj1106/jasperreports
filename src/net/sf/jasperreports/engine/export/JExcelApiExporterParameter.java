/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Contributor: Manuel Paul <mpaul@ratundtat.com>, 
 *				Rat & Tat Beratungsgesellschaft mbH, 
 *				Muehlenkamp 6c,
 *				22303 Hamburg,
 *				Germany.
 */
package net.sf.jasperreports.engine.export;

import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;




/**
 * @author Manuel Paul (mpaul@ratundtat.com)
 * @version $Id$
 * @deprecated To be removed. Use {@link JRXlsExporter} or {@link JRXlsxExporter} instead.
 */
public class JExcelApiExporterParameter extends JRXlsAbstractExporterParameter {

	protected JExcelApiExporterParameter(String name) {
		super(name);
	}

}
