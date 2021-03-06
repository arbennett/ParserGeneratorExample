/*
 * generated by Xtext 2.9.2
 */
package org.eclipse.ice.example.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ice.example.services.ExampleGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ExampleSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExampleGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Input_NEWLINETerminalRuleCall_1_a;
	protected AbstractElementAlias match_Line_ASSIGNTerminalRuleCall_1_p;
	protected AbstractElementAlias match_Section_NEWLINETerminalRuleCall_3_0_p;
	protected AbstractElementAlias match_Section_NEWLINETerminalRuleCall_4_p;
	protected AbstractElementAlias match_Section_OPENTerminalRuleCall_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExampleGrammarAccess) access;
		match_Input_NEWLINETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getInputAccess().getNEWLINETerminalRuleCall_1());
		match_Line_ASSIGNTerminalRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getLineAccess().getASSIGNTerminalRuleCall_1());
		match_Section_NEWLINETerminalRuleCall_3_0_p = new TokenAlias(true, false, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_3_0());
		match_Section_NEWLINETerminalRuleCall_4_p = new TokenAlias(true, false, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_4());
		match_Section_OPENTerminalRuleCall_0_p = new TokenAlias(true, false, grammarAccess.getSectionAccess().getOPENTerminalRuleCall_0());
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Input_NEWLINETerminalRuleCall_1_a.equals(syntax))
				emit_Input_NEWLINETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Line_ASSIGNTerminalRuleCall_1_p.equals(syntax))
				emit_Line_ASSIGNTerminalRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Section_NEWLINETerminalRuleCall_3_0_p.equals(syntax))
				emit_Section_NEWLINETerminalRuleCall_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Section_NEWLINETerminalRuleCall_4_p.equals(syntax))
				emit_Section_NEWLINETerminalRuleCall_4_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Section_OPENTerminalRuleCall_0_p.equals(syntax))
				emit_Section_OPENTerminalRuleCall_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     ASSIGN+
	 *
	 * This ambiguous syntax occurs at:
	 *     varName=ID (ambiguity) value=TEXT
	 */
	protected void emit_Line_ASSIGNTerminalRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NEWLINE+
	 *
	 * This ambiguous syntax occurs at:
	 *     lines+=Line (ambiguity) lines+=Line
	 *     sectionName=ID CLOSE (ambiguity) lines+=Line
	 */
	protected void emit_Section_NEWLINETerminalRuleCall_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NEWLINE+
	 *
	 * This ambiguous syntax occurs at:
	 *     lines+=Line (ambiguity) (rule end)
	 */
	protected void emit_Section_NEWLINETerminalRuleCall_4_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     OPEN+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) sectionName=ID
	 */
	protected void emit_Section_OPENTerminalRuleCall_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
