/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.expression.TriggerVariableExpression;

public final class ASTTriggerVariableExpression extends AbstractApexNode<TriggerVariableExpression> {

    ASTTriggerVariableExpression(TriggerVariableExpression triggerVariableExpression) {
        super(triggerVariableExpression);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
