/*
 *  "ChemLab", Desktop helper application for chemists.
 *  Copyright (C) 1996-1998, 2015 by Serg V. Zhdanovskih (aka Alchemist, aka Norseman).
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package chemlab.core.controls.experiment;

/**
 *
 * @author Serg V. Zhdanovskih
 * @since 0.6.0
 */
public final class Connection
{
    public final LabDevice Dev1;
    public final LabDevice Dev2;
    
    public Connection(LabDevice dev1, LabDevice dev2)
    {
        this.Dev1 = dev1;
        this.Dev2 = dev2;
    }
}
