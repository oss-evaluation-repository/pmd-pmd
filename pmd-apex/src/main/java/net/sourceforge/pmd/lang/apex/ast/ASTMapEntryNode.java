/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.expression.MapEntryNode;

public final class ASTMapEntryNode extends AbstractApexNode<MapEntryNode> {

    ASTMapEntryNode(MapEntryNode mapEntryNode) {
        super(mapEntryNode);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
