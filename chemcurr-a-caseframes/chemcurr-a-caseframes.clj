
;;; A

(defineCaseframe 'ChemicalReaction '('additionReaction substrate-substance added-substance)
  :docstring "addition reaction in which [added-substance] is added to [substrate-substance]")

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '(actions analysandum)
  :docstring "analyse [analysandum]"
  :fsymbols '(analyseILO))

(defineCaseframe 'Act '('alterPropertyOf type-of-alteration property thing-with-property)
  :docstring "make [type-of-alteration] to [property] of [thing-with-property]")

(defineCaseframe 'Amount '('amountOf thing-with-amount)
  :docstring "amount of [thing-with-amount]")

(defineCaseframe 'AnionicChemicalEntity '('anionOf chemical-referent)
  :docstring "anion of [chemical-referent]")

; FrameNet: derived from Arriving
(defineCaseframe 'Thing '(arrival arriving-thing thing-arrived-at)
  :docstring "arrival of [arriving-thing] at [thing-arived-at]"
  :fsymbols '(approachOfTo arrivalAt))

(defineCaseframe 'Thing '('assumptionsOf thing-with-assumptions)
  :docstring "assumptions of  [thing-with-assumptions]")



;;; B

(defineCaseframe 'Proposition '(Basing entity-with-base base)
    :docstring "[entity-with-base] is based on [base]"
    :fsymbols '(BasedOn BuiltOn ConstructedOn))

(defineCaseframe 'Thing '('beamOf beam-constituent)
  :docstring "a beam of [beam-constituent]s")

; FrameNet: Becoming
(defineCaseframe 'Proposition '('BecomesCategorised entity final-category)
  :docstring "[entity] becomes member of [final-category]")

; FrameNet: Becoming
(defineCaseframe 'Proposition '('BecomesPartOf  entity final-system)
  :docstring "[entity] becomes part of [final-system]")

; FrameNet: Becoming
(defineCaseframe 'Proposition '('BecomesPropertied entity final-property)
  :docstring "[entity] acquires [final-property]")

; FrameNet: Being_necessary
(defineCaseframe 'Proposition '(BeingNecessary requirement dependent)
  :docstring "[requirement] is necessary for [dependent]"
  :fsymbols '(IsEssentialTo IsNecessaryFor IsRequiredFor))

(defineCaseframe 'Thing '('behaviorOf thing-with-behavior)
  :docstring "behavior of [thing-with-behavior]")

(defineCaseframe 'Thing '('behaviorOfClass class-with-behavior)
  :docstring "behavior of [class-with-behavior]")

(defineCaseframe 'Bonding '('bondingIn substance)
  :docstring "bonding in [substance]")

(defineCaseframe 'Qualifier '('byMeans means)
  :docstring "by [means] ")

(defineCaseframe 'Means '('byReactionOf reactants)
  :docstring "by reaction of [reactants]")

;;; C

(defineCaseframe 'ILO '(actions result-of-calculation)
    :docstring "calculate [result-of-calculation]"
    :fsymbols '(calculateILO))

(defineCaseframe 'Thing '('cardinalityOf thing-with-cardinality)
  :docstring "cardinality of [thing-with-cardinality]")

;;; FrameNet: Categorization
(defineCaseframe 'ILO '(categorise categorisable-thing category )
  :docstring "categorise [categorisable-thing] into [category]"
  :fsymbols '(classifyILO categoriseILO))

(defineCaseframe 'CationicChemicalEntity '('cationOf chemical-referent)
  :docstring "cation of [chemical-referent]")

; FrameNet: Causation
(defineCaseframe 'Proposition '(Causation cause effect)
  :docstring "[cause] is cause of [effect] "
  :fsymbols '(IsConsequenceOf IsEffectOf IsResultOf GivesRiseTo))

; FrameNet: Cause_change, Undergo_change
(defineCaseframe 'Change '(change thing-with-change)
  :docstring "change in [thing-with-change]"
  :fsymbols '(changeIn modificationOf))

(defineCaseframe 'Characterisation '('characterisationOf characterisable-thing)
  :docstring "characterisation of [characterisable-thing]")

(defineCaseframe 'ChemicalReaction '('chemicalReactionReactantsProducts reactants products)
  :docstring "chemical reaction involving [reactants] and [products]")

(defineCaseframe 'ChemicalReaction '('chemicalReactionByReactants reactants)
  :docstring "chemical reaction involving [reactants]")

(defineCaseframe 'Chemistry '('chemistryOf chemical-substance)
  :docstring "chemistry of [chemical-substance]")

(defineCaseframe 'Chemistry '('chemistryOfClass substance-class)
  :docstring "chemistry of [substance-class]")

(defineCaseframe 'Chemistry '('chemistryOfProcess process)
  :docstring "chemistry of [process]")

(defineCaseframe 'Proposition '(Circumstancing entity-with-circumstances circumstances)
    :docstring "[entity-with-circumstances] takes place in [circumstances]"
    :fsymbols '(InCircumstances InSystem InChemicalSystem))

(defineCaseframe 'Comparative '('comparativeOf comparative-sense  comparative-thing)
  :docstring "comparative of [comparative-thing] in [comparative-sense]")

(defineCaseframe 'Conc '('concentrationOf chemical-referent)
  :docstring "concentration of  [chemical-referent]")

(defineCaseframe 'ILO '(actions comparison-set)
  :docstring "compare [comparison-set]"
  :fsymbols '(compareILO matchILO))

(defineCaseframe 'Thing '('conditionsFor thing-with-conditions)
  :docstring "conditions for [thing-with-conditions]")

; FrameNet: Control
(defineCaseframe 'Proposition '(Control controlling-entity dependent-entity)
  :docstring "[controlling-entity] controls [dependent-entity]"
  :fsymbols '(Controls Determines Regulates Commands Encodes))

(defineCaseframe 'ILO '(actions constructible-thing)
  :docstring "construct  [constructible-thing]"
  :fsymbols '(constructILO))

;;; D

(defineCaseframe 'Thing '('data thing-with-data)
  :docstring "data on [thing-with-data]")

; from FrameNet frame: Categorization
(defineCaseframe 'ILO '(actions definable-thing)
  :docstring "define [definable-thing]"
  :fsymbols '(defineILO))

; from FrameNet frame: Communicate_categorization
(defineCaseframe 'ILO '(actions definable-thing modification)
  :docstring "define [definable-thing] with [modification]"
  :fsymbols '(defineILO2))

; from FrameNet frame: Communicate_categorization
(defineCaseframe 'ILO '(actions describable-thing)
  :docstring "describe [describable-thing]"
  :fsymbols '(describeILO outlineILO))

; from FrameNet frame: Coming_to_believe
(defineCaseframe 'ILO '(actions deducible-entity)
    :docstring "deduce [deducible-entity]"
    :fsymbols '(deduceILO workOutILO deriveILO ascertainILO determineILO figureOutILO inferILO puzzleOutILO surmiseILO deduceHowILO))

; from FrameNet frame:  Departing
(defineCaseframe 'Thing '(departure thing-departing thing-departed-from)
  :docstring "departure of [departing-thing] from [thing-departed-from]"
  :fsymbols '(departureOfFrom))

(defineCaseframe 'Thing '('determinationOf thing-to-be-determined)
  :docstring "determination of [thing-to-be-determined]")

(defineCaseframe 'Difference '('differenceBetween differees)
  :docstring "difference between [differees]")

; FrameNet: Differentiation
(defineCaseframe 'ILO '(actions  phenomena)
  :docstring "differentiate between [phenomena]"
  :fsymbols '(differentiateBetweenILO))

(defineCaseframe 'Direction '('directionOf thing-with-direction)
  :docstring "direction of [thing-with-direction]")

; from FrameNet frame: Topic
(defineCaseframe 'ILO '(actions discussible-thing)
  :docstring "discuss [discussible-thing]"
  :fsymbols '(discussILO))

(defineCaseframe 'ChemicalReaction '('displacementOfFrom displaced-referent substrate-referent)
  :docstring "displacement reaction of [displaced-referent] from [substrate-referent]")

(defineCaseframe 'ChemicalReaction '('displacementOfFromClass displaced-referent substrate-class)
  :docstring "displacement reaction of [displaced-referent] from [substrate-class]")

(defineCaseframe 'ILO '(actions distinguishable-things)
  :docstring "distinguish between [distinguishable-things]"
  :fsymbols '(distinguishBetweenILO))

(defineCaseframe 'Thing '('distributionOf thing-with-distribution)
  :docstring "distribution of [thing-with-distribution]")

(defineCaseframe 'Thing '('domain domain)
  :docstring "the [domain]")


;;; E

(defineCaseframe 'Thing '(effectOfObjectiveInfluence objective-influence)
  :docstring "effect of [objective-influence]"
  :fsymbols '(effectOf resultOf))

(defineCaseframe 'Thing '('electronicConfigurationOf chemical-entity)
  :docstring "electronic configuration of [chemical entity]")

(defineCaseframe 'EliminationReaction '('eliminationOfFromSubstrate eliminate substrate)
  :docstring "elimination of [eliminate] from [substrate]")

(defineCaseframe 'EquilibriumPosition '('equilibriumPositionOf chemical-reaction)
  :docstring "equilibrium position of [chemical-reaction]") 

(defineCaseframe 'ILO '(actions entity-with-explanation)
    :docstring "explain the [entity-with-explanation]"
    :fsymbols '(explainILO explainWhyILO accountForILO explainTermILO explainAndUseTermILO))

(defineCaseframe 'Qualifier '(examples example)
  :docstring "with [example]"
  :fsymbols '(withExample asExample includingExample asIn analogousTo))

;;; F

(defineCaseframe 'Feasibility '('feasibilityOf chemical-reaction)
  :docstring "feasibility of  [chemical-reaction]")

(defineCaseframe 'Qualifier '('forSubstrateClass substrate-class)
  :docstring "for [substrate-class]")

; FrameNet: Creating
(defineCaseframe 'Creation  '(creating thing-created)
  :docstring "creation of [thing-created"
  :fsymbols '(formationOf creationOf generationOf productionOf ))

(defineCaseframe 'FunctionalGroupTransformation '('functionalGroupTransformation reactant product)
  :docstring "functional group transformation of  [reactant] to [product]")

;;; G

(defineCaseframe 'Modifier '('given thing-given)
 :docstring "given [thing-given]")

(defineCaseframe 'Category '('graphClass dependent-quantity independent-quantity)
  :docstring "class of graphs of [dependent-quantity] against [independent-quantity]")

(defineCaseframe 'GreaterComparative '('greaterComparative property)
  :docstring "greater comparative of [property]")

;;; H

(defineCaseframe 'Proposition '('HasChemicalStructure chemical-referent chemical-structure)
  :docstring "[chemical-referent] has [chemical-structure]")

(defineCaseframe 'Proposition '('HasClassName nameable-class class-name)
  :docstring "[namable-class] has [class-name]")

(defineCaseframe 'Proposition '('HasElectrodePotential electrode electrode-potential)
  :docstring "[electrode] has [electrode-potential]")

(defineCaseframe 'Proposition '('HasElectronicConfiguration chemical-referent electronic-configuration)
  :docstring "[chemical-referent] has [electronic-configuration]")

(defineCaseframe 'Proposition '('HasElectrostaticCharge thing-with-charge sign magnitude)
  :docstring "[thing-with-charge] has charge of [sign] and [magnitude]")

(defineCaseframe 'Proposition '('HasEnteringGroup substitution-reaction entering-group)
  :docstring "[substitution-reaction] has [entering-group]")

(defineCaseframe 'Proposition '('HasEquilibriumConstant chemical-reaction equilibrium-constant)
  :docstring "[chemical-reaction] has [equilibrium-constant]")

(defineCaseframe 'Proposition '('HasEquilibriumPosition chemical-reaction equilibrium-position)
  :docstring "[chemical-reaction] has [equilibrium-position]")

(defineCaseframe 'Proposition '('HasEValue redox-system e-value)
  :docstring "[redox-system] has [e-value]")

(defineCaseframe 'Proposition '('HasGenericMemberName class generic-member-name)
  :docstring "[class] has generic member [generic-member-name]")

(defineCaseframe 'Proposition '('HasIonisationEnergy chemical-referent ionisation-ordinal ionisation-energy-value)
  :docstring "[chemical-referent] has [ionisation-ordinal] ionisation energy of [ionisation-energy-value]")

(defineCaseframe 'Proposition '('HasIsomer chemical-referent isomer)
  :docstring "[chemical-referent] has [isomer]")

(defineCaseframe 'Proposition '('HasReactionCondition chemical-reaction reaction-condition)
  :docstring "[chemical-reaction] has [reaction-condition]")

(defineCaseframe 'Proposition '('HasTypedIsomer isomer-type chemical-referent isomer)
  :docstring "[chemical-referent] has [isomer] of type [isomer-type]")

(defineCaseframe 'Proposition '('HasHalfReaction redox-reaction half-reaction)
  :docstring "[redox-reaction] has [half-reaction]")

(defineCaseframe 'Proposition '('HasLigand complex-ion ligand)
  :docstring "[complex-ion] has [ligand]")

(defineCaseframe 'Proposition '('HasMer mer polymer)
  :docstring "[polymer] has [mer]")

(defineCaseframe 'Proposition '('HasMetalIon complex-ion metal-ion)
  :docstring "[complex-ion] has [metal-ion]")

(defineCaseframe 'Proposition '(HasName nameable-thing thing-name)
  :docstring "[nameable-thing] has [thing-name]"
  :fsymbols '(HasSystematicName HasIupacName HasIupacNameSubstitutive 
              HasIupacNameAdditive HasAcceptableCommonName HasPreferredIupacName 
              HasGeneralIupacName HasRetainedIupacName HasTrivialName HasAtomName 
              HasElementName HasMoleculeName HasSubstanceName HasOtherName))

(defineCaseframe 'Proposition '('HasNumberOfAtomsOfType chemical-referent number-of-atoms element)
  :docstring "[chemical-referent] has [number-of-atoms] of type [element]")

(defineCaseframe 'Proposition '('HasPositionInPeriodicTable element position-in-periodic-table)
  :docstring "[element] has [position-in-periodic-table]")

(defineCaseframe 'Proposition '('HasColumnInPeriodicTable element column-in-periodic-table)
  :docstring "[element] has [column-in-periodic-table]")

(defineCaseframe 'Proposition '('HasRowInPeriodicTable element row-in-periodic-table)
  :docstring "[element] has [row-in-periodic-table]")

(defineCaseframe 'Proposition '('HasStandardCellPotential electrochemical-cell standard-cell-potential)
  :docstring "[electrochemical-cell] has [standard-cell-potential]")

(defineCaseframe 'Proposition '('HasSymbolicPropertyElement symbolic-property-class thing-with-property symbolic-property-element)
  :docstring "[thing-with-property] has [symbolic-property-element] in [symbolic-property-class]")

(defineCaseframe 'Proposition '('HasQuantity thing-with-quantity quantity)
  :docstring "[thing-with-quantity] has [quantity]")

(defineCaseframe 'Proposition '('HasShape thing-with-shape shape)
     :docstring "[thing-with-shape] has [shape]")

(defineCaseframe 'Proposition '('HasShapeProperty shape shape-property)
     :docstring "[shape] has [shape-property]")

(defineCaseframe 'Proposition '('HasStructure chemical-referent  molecular-structure)
     :docstring "[chemical-referent] has [molecular-structure]")

(defineCaseframe 'Proposition '('HasTypedFormula formula-type chemical-referent chemical-formula)
  :docstring  "[chemical-formula] is [formula-type] of [chemical-referent]")

(defineCaseframe 'Proposition '('HasValue quantity value)
     :docstring "[quantity] has [value]")

;;; I

; from FrameNet frame: Categorization
(defineCaseframe 'ILO '(actions categorisable-thing)
    :docstring "identify [identifiable-thing]"
    :fsymbols '(identifyILO interpretILO))

(defineCaseframe 'Proposition  '('ILOModifier ilo clause modification)
  :docstring "[clause] of [ilo] is modified by [modification]")

(defineCaseframe 'Proposition  '('ILOQualifier ilo qualification)
  :docstring "[ilo] is qualified by [qualification]")

(defineCaseframe 'Qualifier '('inCase proposition)
  :docstring "in the case of [proposition]")

(defineCaseframe 'Qualifier '('inChemicalSystem chemical-system)
  :docstring "in [chemical-system]")

(defineCaseframe 'Modifier '(including inclusion-set)
  :docstring "including [inclusion-set]"
  :fsymbols '(including containing integrating incorporating))

(defineCaseframe 'Proposition '(InDomain domain-predicate domain)
  :docstring "[domain-predicate] relates to, refers to, is expressed in terms belonging to [domain]"
  :fsymbols '(InTermsOf InRelationTo WithReferenceTo WithRegardsTo WithParticularReferenceTo AsAppliedTo))

(defineCaseframe 'Qualifier '(inDomain domain)
  :docstring "in [domain]"
  :fsymbols '(inTermsOf inRelationTo withReferenceTo withRegardsTo withParticularReferenceTo asAppliedTo))

(defineCaseframe 'Information '(information topic)
  :docstring "information on [topic]"
  :fsymbols '(dataOn informationOn))

(defineCaseframe 'Qualifier '('inManner manner)
  :docstring "in [manner]")

(defineCaseframe 'ChemicalSubstance '('inPhysicalState chemical-substance physical-state)
  :docstring "[chemical-substance] in [physical-state]")



(defineCaseframe 'Qualifier '('inSystem system)
  :docstring "in [system]")

; from FrameNet frame: Categorization
(defineCaseframe 'ILO '(actions interpretable-thing)
    :docstring "interpret [interpretable-thing]"
    :fsymbols '(interpretILO))

(defineCaseframe 'Proposition '('IsAnalogousTo entity analogue)
  :docstring "[entity] is analogous to [analogue]")

(defineCaseframe 'Proposition '('IsConstituentOf element chemical-referent)
  :docstring "[element] is constituent of [chemical-referent]")

; related to FrameNet: Categorization
(defineCaseframe 'Categorization '('IsInDomain entity domain)
  :docstring "[entity] is in [domain]")

(defineCaseframe 'ILO '(actions act)
  :docstring "intentionally carry out [act]"
  :fsymbols '(intentionallyActILO actILO carryOutILO performILO doILO executeILO describeHowToILO))

(defineCaseframe 'Proposition '('InPresenceOf thing-in-presence thing-with-presence)
  :docstring "[thing-in-presence] is in presence of [thing-with-presence]")

(defineCaseframe 'Thing '('interactionBetweenClass interactant-classes)
  :docstring "interaction between [interactant-classes]")

(defineCaseframe 'Qualifier '('inPresenceOf present-thing)
  :docstring "in presence of [present-thing]")

(defineCaseframe 'Proposition '('Involves involving-entity involvate)
  :docstring "[involving-entity] involves [involvate]")

(defineCaseframe 'Proposition '('IsAtEquilibrium chemical-reaction)
  :docstring "[chemical-reaction] is at equilibrium")

(defineCaseframe 'Proposition '('IsBalanced chemical-equation)
  :docstring "[chemical-equation] is balanced")

(defineCaseframe 'Proposition '(IsEffectOfObjectiveInfluence effect)
  :docstring "is [effect]"
  :fsymbols '(Effect ResultsIn))

(defineCaseframe 'Proposition '('IsFunctionalGroupTestFor chemical-test tested-for-class)
  :docstring "[chemical-test] is chemical test for members of [tested-for-class]")

(defineCaseframe 'Proposition '('IsInContactWith contacters)
  :docstring "[contacters] are in contact")

(defineCaseframe 'Proposition '('IsInState chemical-referent physical-state)
  :docstring "[chemical-referent] is in [physical-state]")

(defineCaseframe 'Proposition '('IsInSystem thing system)
  :docstring "[thing] is in [system]")

(defineCaseframe 'Proposition '('IsIonOf ionic-referent chemical-referent)
  :docstring "[ionic referent] is ion of  [chemical-referent]")

(defineCaseframe 'Proposition  '('IsIsotopeOf isotope element)
  :docstring "[isotope] is an isotope of [element]")

(defineCaseframe 'Proposition  '('IsProductOf product chemical-reaction)
  :docstring "[product] is product of [chemical-reaction]")

(defineCaseframe 'Proposition  '('IsReactantOf reactant chemical-reaction)
  :docstring "[reactant] is reactant of [chemical-reaction]")

(defineCaseframe 'Proposition  '('IsReactantOrProductOf chemical-substance chemical-reaction)
  :docstring "[chemical-substance] is reactant or product of [chemical-reaction]")

(defineCaseframe 'Proposition  '('IsSimilarTo similar-things)
  :docstring "[similar-things] are similar")

(defineCaseframe 'Proposition  '('IsSubsequenceOf sequence thing-with-sequence)
  :docstring "[sequence] is subsequence of [thing-with-sequence]")

(defineCaseframe 'Proposition  '('IsToxic toxic-thing)
  :docstring "[toxic-thing] is toxic")

;;; J

;;; K

;;; L

; FrameNet: Likelihood
(defineCaseframe 'Thing '('likelihoodOf hypothetical-event)
  :docstring "likelihood of [hypothetical-event]")

;;; M

; from FrameNet resource: Manufacturing
(defineCaseframe 'Thing '('manufactureOfFrom manufacturand resource)
  :docstring "manufacture of [manufacturand] from [resource]")

(defineCaseframe 'MathematicalExpression '('mathematicalExpressionFor math-expressible-entity)
  :docstring "mathematical expression for [math-expressible-entity]")

(defineCaseframe 'Act '('measure measurable-thing)
  :docstring "measure [measurable-thing]")

; from FrameNet frame: Means
(defineCaseframe 'Proposition '(Means method goal)
  :docstring "[method] is method for achieving [goal]"
  :fsymbols '(IsMethodFor IsMeansFor))

(defineCaseframe 'MechanismOfReactionType '('mechanismOfReactionType reaction-type)
  :docstring "mechanism of [reaction-type]")

(defineCaseframe 'ChemicalReagent '('modifiedChemicalReagent reagent modification)
  :docstring "chemical [reagent]  [modification]")

(defineCaseframe 'Modifier '(modInDomain domain)
  :docstring "[domain]"
  :fsymbols '(modInTermsOf modInRelationTo modWithReferenceTo modWithRegardsTo modWithParticularReferenceTo modAsAppliedTo))

(defineCaseframe 'Proposition '(MolecularConstitution  chemical-entity element)
  :docstring "[chemical-entity] is a compound of [element]"
 :fsymbols '(IsCompoundOf ContainsElement))

;;; N

; FrameNet: Distinctiveness
(defineCaseframe 'Aspect '('namedAspectOf aspect thing-with-aspect)
  :docstring "[aspect]  of  [thing-with-aspect]")

; FrameNet: Distinctiveness
(defineCaseframe 'Aspect '('namedAspectOfClass aspect class-with-aspect)
  :docstring "[aspect]  of  [class-with-aspect]")

(defineCaseframe 'Thing '('namedChemicalChangeOfClass chemical-change class)
  :docstring "[chemical-change] of [class]")

(defineCaseframe 'ChemicalProperty '('namedChemicalPropertyOf chemical-property thing-with-property)
  :docstring "[chemical-property] of [thing-with-property]")

(defineCaseframe 'Property '('namedDerivedPropertyOf derived-property thing-with-property)
  :docstring "[derived-property] of [thing-with-property]")

(defineCaseframe 'PhysicalProcess '('namedPhysicalProcessOf physical-process chemical-substance)
  :docstring "[physical-process] of [chemical-substance]")

(defineCaseframe 'Property '('namedNonPhysicalPropertyOf non-physical-property thing-with-property)
  :docstring "[non-physical-property] of [thing-with-property]")

(defineCaseframe 'Property '('namedPhysicalPropertyOf physical-property thing-with-property)
  :docstring "[physical-property] of [thing-with-property]")

(defineCaseframe 'Quantity '('namedPhysicalQuantityOf quantity thing-with-quantity)
  :docstring "[physical-quantity] of [thing-with-quantity]")

(defineCaseframe 'Property '('namedPhysicalPropertyOfClass physical-property class)
  :docstring "[physical-property] of [class]")

(defineCaseframe 'Process '('namedProcessOf process processed-thing)
  :docstring "[process] of [processed-thing]")

(defineCaseframe 'Thing '('namedRelativePropertyOf property things-with-property)
  :docstring "relative [property] of [things-with-property]")

(defineCaseframe 'Quantity '('namedQuantityOfClass  class-quantity  class)
  :docstring "[class-quantity] of [class]")

(defineCaseframe 'Thing '('new renewed-thing)
  :docstring "new version of [renewed-thing]")

;;; O

; FrameNet: Objective_influence
(defineCaseframe 'Proposition '(ObjectiveInfluence influencing-entity dependent-entity)
  :docstring "[influencing-entity] has effect on [dependent-entity]"
  :fsymbols '(HasEffectOn))

; FrameNet: Objective_influence
;(defineCaseframe 'Thing '(objectiveInfluence influencing-entity dependent-entity)
 ; :docstring "effect of [influencing-entity] on [dependent-entity]"
 ; :fsymbols '(effectOfOn))

; FrameNet: Objective_influence
(defineCaseframe 'ObjectiveInfluence '(objectiveInfluence influencing-thing object-of-influence)
  :docstring "effect of [influencing-thing] on [object-of-influence]"
  :fsymbols '(effectOfOn influenceOfOn impactOfOn powerOfOver))

; FrameNet: Objective_influence
(defineCaseframe 'ObjectiveInfluence '(objectiveInfluenceOfClass influencing-class object-of-influence)
  :docstring "effect of [influencing-class] on [object-of-influence]"
  :fsymbols '(effectOfClassOn influenceOfClassOn impactOfClassOn powerOfClassOver))

; FrameNet: Objective_influence
(defineCaseframe 'ObjectiveInfluence '(objectiveInfluenceToBringAbout influencing-thing act)
  :docstring "effect of [influencing-thing] to bring about [act]"
  :fsymbols '(effectOfTo))

(defineCaseframe 'ChemicalReaction '('oxidationReactionOfToWith reactant product reagent)
  :docstring "oxidation of [reactant] to [product] with [reagent]")

(defineCaseframe 'ChemicalReaction '('oxidationReactionOfWith reactant reagent)
  :docstring "oxidation of [reactant]  with [reagent]")

;;; P

(defineCaseframe 'NamedCardinalGroup '('pairOf cardinal-item)
  :docstring "pair of [cardinal-item]s")

(defineCaseframe 'Act '('performActionOn type-of-action object-of-action)
  :docstring "perform [type-of-action] on [object-of-action]")

(defineCaseframe 'ILO '(actions object-of-calculation)
  :fsymbols '(performCalculationsILO))
  :docstring "perform calculations involving [object-of-calculation]"

(defineCaseframe 'PhysicalProperties '('physicalPropertiesOf substance)
  :docstring "physical properties of [substance]")

(defineCaseframe 'PhysicalProperties '('physicalPropertiesOfClass class-with-physical-properties)
  :docstring "physical properties of [class-with-physical-properties]")

(defineCaseframe 'PhysicalState '('physicalStateOf chemical-substance)
  :docstring "physical state of [chemical-substance]")

; FrameNet: Predicting
(defineCaseframe 'ILO '(actions eventuality)
  :docstring "predict [eventuality]"
  :fsymbols '(predictILO))

(defineCaseframe 'Product '('productsOf chemical-reaction)
  :docstring "products of  [chemical-reaction]")

(defineCaseframe 'Properties '('propertiesOf thing-with-property)
  :docstring "properties of [thing-with-property]")

(defineCaseframe 'Properties '('propertiesOfClass class-with-properties)
  :docstring "properties of [class-with-properties]")

(defineCaseframe 'PurposeQualifier '(purpose purpose)
  :docstring "the [purpose]"
  :fsymbols '(inOrderTo))

;;; Q

(defineCaseframe 'Thing '('namedQuantityOf quantity thing-with-quantity)
  :docstring "[quantity] of [thing-with-quantity")

;;; R

(defineCaseframe 'ReactionRate '('rateOf chemical-reaction)
  :docstring "rate of [chemical-reaction]")

(defineCaseframe 'ReactionCondition '('reactionConditionsOf chemical-reaction)
  :docstring " reaction conditions of [chemical-reaction]")

(defineCaseframe 'ReactionType '('reactionTypeOfClass reaction-type substance-class)
  :docstring "[reaction-type] reaction of [substance-class]")

(defineCaseframe 'ChemicalReaction '('reactionTypeOnSubstrate reaction-type substrate)
  :docstring "reaction of [reaction-type] on [substrate]")

(defineCaseframe 'Thing '('reactivityOf reactive-entity)
  :docstring "reactivity of [reactive-entity]")

(defineCaseframe 'Thing '('reactivityOfClass reactive-class)
  :docstring "reactivity of [reactive-class]")

(defineCaseframe 'Thing '('reactivityOfClassWithClass  reactive-class-1 reactive-class-2)
  :docstring "reactivity of [reactive-class-1] with [reactive-class-2]")

; FrameNet: Becoming_aware
(defineCaseframe 'ILO '(actions recognizable-thing)
  :docstring "recognize [recognizable-thing]"
  :fsymbols '(recognizeILO))

(defineCaseframe 'RedoxSystem '('redoxSystem reductant oxidant)
  :docstring "redox system with [reductant] and [oxidant]")

(defineCaseframe 'Thing '('relationBetween related-things)
  :docstring "relation between [related-things]")

(defineCaseframe 'Thing '('relativeNamedPhysicalPropertyOfClass physical-property class)
  :docstring "relative [physical-property] of [class]") 

(defineCaseframe 'Thing '('relativeReactivityOf reactive-entities)
  :docstring "relative reactivity of [reactive-entities]")

; FrameNet: Removing
(defineCaseframe 'Removal '('removalOfFrom removand removal-source)
  :docstring "removal of [removand] from [removal-source]")

(defineCaseframe 'ILO '(actions relate-source relate-sink)
  :docstring "relate [relate-source] to [relate-sink]"
  :fsymbols '(relateToILO))

(defineCaseframe 'ChemicalTestResult '('chemicalTestResult chemical-test)
  :docstring "result of [chemical-test]")

(defineCaseframe 'Role '('roleOfAs thing-with-role role)
  :docstring "[role] of [thing-with-role]")

(defineCaseframe 'Role '('roleOfInProcess thing-with-role process)
  :docstring "role of [thing-with-role] in [process]")

(defineCaseframe 'Role '('roleOfInSystem thing-with-role system)
  :docstring "role of [thing-with-role] in [system]")

;;; S

(defineCaseframe 'Separation '('separationOf separable-things)
  :docstring "separation of [separable-things]")

(defineCaseframe 'Thing '('shapeOf thing-with-shape)
  :docstring "shape of a [thing-with-shape]")

(defineCaseframe 'ILO '(actions phenomenon)
  :docstring "show awareness of [phenomenon]"
  :fsymbols '(showAwarenessOfILO))

(defineCaseframe 'SmallerComparative '('smallerComparative property)
  :docstring "smaller comparative of [property]")

; FrameNet: Resolve_problem
(defineCaseframe 'Act '('solveProblem problem)
  :docstring "solve [problem]")

(defineCaseframe 'ILO '(actions topic)
  :docstring "summarise [topic]"
  :fsymbols '(summariseILO outlineILO sumUpILO provideSynopsisOfILO))

(defineCaseframe 'Thing '('stabilisationOf stabilised-thing)
  :docstring "stabilisation of [stabilised-thing]")

(defineCaseframe 'Thing '('stabilisationOfBy stabilised-thing stabilisation-agency)
  :docstring "stabilisation of [stabilised-thing] through [stabilisation-agency]")

(defineCaseframe 'ILO '(actions statable-thing)
  :docstring "state [statable-thing]"
  :fsymbols '(stateILO writeILO writeDownILO proposeILO recountILO reportILO suggestILO relateILO))



(defineCaseframe 'SubstitutionReaction '('substitutionReaction substrate entering-group leaving-group)
  :docstring "substitution reaction of [substrate] in which [leaving-group] is substituted by [entering-group]")

;;; T

(defineCaseframe 'ChemicalTest '('testForClass tested-for-class)
  :docstring "chemical test for members of [tested-for-class]")

(defineCaseframe 'Trend '('trendIn trending-property)
  :docstring "trend in [trending-property]")

(defineCaseframe 'Trend '('trendInPropertyOf trending-property things-with-trending-property)
  :docstring "trend in [trending-property] of [things-with-trending-property]")

(defineCaseframe 'ChemicalReaction '('typedChemicalReactionOfClass reaction-type reactant-class)
  :docstring "[reaction-type] reaction of [reactant-class]")

(defineCaseframe 'Thing '('typeOfThing thing-with-type)
  :docstring "type of [thing-with-type]")

;;; U

(defineCaseframe 'Qualifier '('underCondition reaction-condition)
  :docstring "under [reaction-condition]")

(defineCaseframe 'ILO '(actions instrument)
  :docstring "use [instrument]"
  :fsymbols '(useILO applyILO employILO operateILO))

; FrameNet: Using
(defineCaseframe 'Use '('useOf instrument)
  :docstring "use of [instrument]")

; FrameNet: Using
(defineCaseframe 'Use '('useOfFor instrument purpose)
  :docstring "use of [instrument] for ")

; FrameNet: Using
(defineCaseframe 'Use '('useAndCircumstanceOf instrument circumstances-of-use)
  :docstring "use of [instrument] in  [circumstances-of-use]")

; FrameNet: Using
(defineCaseframe 'Use '('useOfClass class)
  :docstring "use of [class]")

; FrameNet: Using
(defineCaseframe 'UsingQualifier '('using instrument)
  :docstring "using [instrument]")

;;; V

(defineCaseframe 'Variation '('variationIn quantity)
 :docstring "variation in  [quantity]")

(defineCaseframe 'Thing '('variationInPhysicalPropertyOf property thing-with-property)
 :docstring "variation in  [property] of [thing-with-property]")

(defineCaseframe 'Thing '('variationInPhysicalPropertyOfClass property class)
 :docstring "variation in  [property] of [class]")

(defineCaseframe 'Thing '('valueOf quantity)
 :docstring "value of [quantity]")

;;; W

(defineCaseframe 'CriterionQualifier '('withCriterion criterion)
  :docstring "with [criterion]")

(defineCaseframe 'ILO '(actions writable)
    :docstring "write [writable]"
    :fsymbols '(writeILO))

;;; X

;;; Y

;;; Z



