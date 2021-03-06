/*
 * generated by Xtext 2.9.2
 */
package org.eclipse.ice.example.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ice.example.project.Input;
import org.eclipse.ice.example.project.Line;
import org.eclipse.ice.example.project.ProjectPackage;
import org.eclipse.ice.example.project.Section;
import org.eclipse.ice.example.services.ExampleGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class ExampleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExampleGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProjectPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProjectPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case ProjectPackage.LINE:
				sequence_Line(context, (Line) semanticObject); 
				return; 
			case ProjectPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     sections+=Section*
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Line
	 *
	 * Constraint:
	 *     (varName=ID+ value=TEXT)
	 */
	protected void sequence_Line(ISerializationContext context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (sectionName=ID+ lines+=Line+)
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
