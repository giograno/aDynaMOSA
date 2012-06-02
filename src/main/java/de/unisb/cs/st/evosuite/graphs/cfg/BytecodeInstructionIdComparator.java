/**
 * Copyright (C) 2011,2012 Gordon Fraser, Andrea Arcuri and EvoSuite contributors
 *
 * This file is part of EvoSuite.
 *
 * EvoSuite is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * EvoSuite is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Public License along with
 * EvoSuite. If not, see <http://www.gnu.org/licenses/>.
 */
package de.unisb.cs.st.evosuite.graphs.cfg;

import java.util.Comparator;

import de.unisb.cs.st.evosuite.graphs.cfg.BytecodeInstruction;
/**
 * Orders CFGVertices according to their id
 * 
 * This is mainly used to put BytecodeInstructions into a PriorityQueue
 * in ControlFlowGraph.getMaximalInitialDistance()
 */
public class BytecodeInstructionIdComparator implements Comparator<BytecodeInstruction> {

	@Override
	public int compare(BytecodeInstruction arg0, BytecodeInstruction arg1) {

		return new Integer(arg0.getInstructionId()).compareTo(arg1.getInstructionId());
	}
}
