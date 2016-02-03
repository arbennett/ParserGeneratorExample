/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.ice.project.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ice.project.services.InputGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class InputSyntacticSequencer extends AbstractSyntacticSequencer {

	protected InputGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Input_NEWLINETerminalRuleCall_1_a;
	protected AbstractElementAlias match_Line_WHITESPACETerminalRuleCall_0_q;
	protected AbstractElementAlias match_Section_NEWLINETerminalRuleCall_3_0_a;
	protected AbstractElementAlias match_Section_NEWLINETerminalRuleCall_4_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (InputGrammarAccess) access;
		match_Input_NEWLINETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getInputAccess().getNEWLINETerminalRuleCall_1());
		match_Line_WHITESPACETerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getLineAccess().getWHITESPACETerminalRuleCall_0());
		match_Section_NEWLINETerminalRuleCall_3_0_a = new TokenAlias(true, true, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_3_0());
		match_Section_NEWLINETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getASSIGNRule())
			return getASSIGNToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCLOSERule())
			return getCLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPENRule())
			return getOPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWHITESPACERule())
			return getWHITESPACEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ASSIGN:
	 *     '=';
	 */
	protected String getASSIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal CLOSE:
	 *     ']';
	 */
	protected String getCLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal NEWLINE:
	 *     '\r'? '\n'+;
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * terminal OPEN:
	 *     '[';
	 */
	protected String getOPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal WHITESPACE:
	 *     (' ' | '\t')+;
	 */
	protected String getWHITESPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Input_NEWLINETerminalRuleCall_1_a.equals(syntax))
				emit_Input_NEWLINETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Line_WHITESPACETerminalRuleCall_0_q.equals(syntax))
				emit_Line_WHITESPACETerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Section_NEWLINETerminalRuleCall_3_0_a.equals(syntax))
				emit_Section_NEWLINETerminalRuleCall_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Section_NEWLINETerminalRuleCall_4_a.equals(syntax))
				emit_Section_NEWLINETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     NEWLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) sections+=Section
	 */
	protected void emit_Input_NEWLINETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WHITESPACE?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Line_WHITESPACETerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NEWLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     lines+=Line (ambiguity) lines+=Line
	 *     name=ID CLOSE (ambiguity) lines+=Line
	 */
	protected void emit_Section_NEWLINETerminalRuleCall_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NEWLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     lines+=Line (ambiguity) (rule end)
	 *     name=ID CLOSE (ambiguity) (rule end)
	 */
	protected void emit_Section_NEWLINETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}