/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.core.parsing.lexer.dialect.postgresql;

import io.shardingjdbc.core.parsing.lexer.LexerAssert;
import io.shardingjdbc.core.parsing.lexer.token.DefaultKeyword;
import io.shardingjdbc.core.parsing.parser.exception.SQLParsingException;
import org.junit.Test;

public final class PostgreSQLLexerTest {
    
    @Test(expected = SQLParsingException.class)
    public void assertNextTokenForVariable() {
        PostgreSQLLexer lexer = new PostgreSQLLexer("SELECT @@x1 FROM TABLE_XXX");
        LexerAssert.assertNextToken(lexer, DefaultKeyword.SELECT, "SELECT");
        lexer.nextToken();
    }
}
