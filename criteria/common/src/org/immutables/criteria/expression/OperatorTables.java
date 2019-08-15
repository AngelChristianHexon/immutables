/*
 * Copyright 2019 Immutables Authors and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.immutables.criteria.expression;

import com.google.common.collect.ImmutableSet;

public final class OperatorTables {

  private OperatorTables() {}

  /**
   * List of operators which can be used on comparables (like numbers)
   */
  public static final ImmutableSet<Operator> COMPARISON = ImmutableSet.of(Operators.EQUAL,
          Operators.NOT_EQUAL, ComparableOperators.GREATER_THAN, ComparableOperators.GREATER_THAN_OR_EQUAL,
          ComparableOperators.LESS_THAN, ComparableOperators.LESS_THAN_OR_EQUAL, ComparableOperators.BETWEEN);


}
