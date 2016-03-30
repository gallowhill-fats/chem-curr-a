
;;; A

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '(actions analysandum)
  :docstring "analyse [analysandum]"
  :fsymbols '(analyseILO))

(defineCaseframe 'Act '('alterPropertyOf type-of-alteration property thing-with-property)
  :docstring "make [type-of-alteration] to [property] of [thing-with-property]")

(defineCaseframe 'AnionicChemicalEntity '('anionOf ionic-chemical-referent)
  :docstring "anion of [ionic-chemical-referent]")

; FrameNet: derived from Arriving
(defineCaseframe 'Thing '(arrival arriving-thing thing-arrived-at)
  :docstring "arrival of [arriving-thing] at  [thing-arived-at]"
  :fsymbols '(approachOfTo arrivalAt))

(defineCaseframe 'Thing '('assumptionsOf thing-with-assumptions)
  :docstring "assumptions of  [thing-with-assumptions]")

;;; B

(defineCaseframe 'Proposition '(Basing entity-with-base base)
    :docstring "[entity-with-base] is based on [base]"
    :fsymbols '(BasedOn BuiltOn ConstructedOn))

(defineCaseframe 'Thing '('beamOf beam-constituent)
  :docstring "a beam of [beam-constituent]s")

(defineCaseframe 'Thing '('behaviorOf thing-with-behavior)
  :docstring "behavior of [thing-with-behavior]")

(defineCaseframe 'Bonding '('bondingIn chemical-referent)
  :docstring "bonding in [chemical-referent]")

(defineCaseframe 'Means '('byReactionOf reactants)
  :docstring "by reaction of [reactants]")

;;; C

(defineCaseframe 'ILO '(actions object-of-calculation)
    :docstring "calculate [object-of-calculation]"
    :fsymbols '(calculateILO))

(defineCaseframe 'Thing '('cardinalityOf thing-with-cardinality)
  :docstring "cardinality of [thing-with-cardinality]")

(defineCaseframe 'CationicChemicalEntity '('cationOf ionic-chemical-referent)
  :docstring "cation of [ionic-chemical-referent]")

(defineCaseframe 'Thing '('changeIn thing-with-change)
  :docstring "change in [thing-with-change]")

(defineCaseframe 'ChemicalReaction '('chemicalReactionByAllSpecies reactants products)
  :docstring "chemical reaction involving [reactants] and [products]")

(defineCaseframe 'ChemicalReaction '('chemicalReactionByReactants reactants)
  :docstring "chemical reaction involving [reactants]")

(defineCaseframe 'Proposition '(Circumstancing entity-with-circumstances circumstances)
    :docstring "[entity-with-circumstances] takes place in [circumstances]"
    :fsymbols '(InCircumstances InSystem InChemicalSystem))

(defineCaseframe 'Thing '('behaviorOfClass class-with-behavior)
  :docstring "behavior of [class-with-behavior]")

(defineCaseframe 'Thing '('physicalPropertiesOfClass class-with-physical-properties)
  :docstring "physical properties of [class-with-physical-properties]")

(defineCaseframe 'Thing '('propertiesOfClass class-with-properties)
  :docstring "properties of [class-with-properties]")

(defineCaseframe 'Comparative '('comparativeOf comparative-sense  comparative-thing)
  :docstring "comparative of [comparative-thing] in [comparative-sense]")

(defineCaseframe 'ILO '(actions comparison-set)
  :docstring "compare [comparison-set]"
  :fsymbols '(compareILO matchILO))

(defineCaseframe 'Thing '('conditionsFor thing-with-conditions)
  :docstring "conditions for [thing-with-conditions]")

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

; from FrameNet frame: Topic
(defineCaseframe 'ILO '(action discussible-thing)
  :docstring "discuss [discussible-thing]"
  :fsymbol '(discussILO))

(defineCaseframe 'ChemicalReaction '('displacementOfFrom displaced-referent substrate-referent)
  :docstring "displacement reaction of [displaced-referent] from [substrate-referent]")

(defineCaseframe 'ChemicalReaction '('displacementOfFromClass displaced-referent substrate-class)
  :docstring "displacement reaction of [displaced-referent] from [substrate-class]")

(defineCaseframe 'ILO '(action distinguishable-things)
  :docstring "distinguish between [distinguishable-things]"
  :fsymbol '(distinguishBetweenILO))

(defineCaseframe 'Thing '('distributionOf thing-with-distribution)
  :docstring "distribution of [thing-with-distribution]")

(defineCaseframe 'Thing '('domain domain)
  :docstring "the [domain]")




;;; E

(defineCaseframe 'Thing '('electronicConfigurationOf chemical-entity)
  :docstring "electronic configuration of [chemical entity]")

; FrameNet: Objective_influence
(defineCaseframe 'Thing '(objectiveInfluence influencing-thing object-of-influence)
  :docstring "effect of [influencing-thing] on [object-of-influence]"
  :fsymbols '(effectOfOn influenceOfOn impactOfOn powerOfOver))

(defineCaseframe 'ILO '(actions entity-with-explanation)
    :docstring "explain the [entity-with-explanation]"
    :fsymbols '(explain explainWhy accountFor explainTerm explainAndUseTerm))

;;; F

(defineCaseframe '('forChemicalSystem chemical-system)
  :docstring "relating to [chemical-system]")

;;; G

(defineCaseframe 'Modifier '('given thing-given)
 :docstring "given [thing-given]")

(defineCaseframe 'Category '('graphClass dependent-quantity independent-quantity)
  :docstring "class of graphs of [dependent-quantity] against [independent-quantity]")

(defineCaseframe 'GreaterComparative '('greaterComparative property)
  :docstring "greater comparative of [property]")

;;; H

(defineCaseframe 'Proposition '('HasClassName nameable-class class-name)
  :docstring "[namable-class] has [class-name]")

(defineCaseframe 'Proposition '('HasElectrodePotential electrode electrode-potential
  :docstring "[electrode] has [electrode-potential]"))

(defineCaseframe 'Proposition '('HasElectronicConfiguration chemical-referent electronic-configuration)
  :docstring "[chemical-referent] has [electronic-configuration]")

(defineCaseframe 'Proposition '('HasElectrostaticCharge thing-with-charge sign magnitude)
  :docstring "[thing-with-charge] has charge of [sign] and [magnitude]")

(defineCaseframe 'Proposition '('HasEValue redox-system e-value)
  :docstring "[redox-system] has [e-value]")

(defineCaseframe 'Proposition '('HasGenericMemberName class generic-member-name)
  :docstring "[class] has generic member [generic-member-name]")

(defineCasefreme 'Proposition '('HasHalfReaction redox-reaction half-reaction)
  :docstring "[redox-reaction] has [half-reaction]")

(defineCaseframe 'Proposition '('HasLigand complex-ion ligand)
  :docstring "[complex-ion] has [ligand]")

(defineCaseframe 'Proposition '('HasMetalIon complex-ion metal-ion)
  :docstring "[complex-ion] has [metal-ion]")

(defineCaseframe 'Proposition '(HasName nameable-thing thing-name)
  :docstring "[nameable-thing] has [thing-name]"
  :fsymbols '(HasSystematicName HasIupacName HasIupacNameSubstitutive 
              HasIupacNameAdditive HasAcceptableCommonName HasPreferredIupacName 
              HasGeneralIupacName HasRetainedIupacName HasTrivialName HasAtomName 
              HasElementName HasMoleculeName HasSubstanceName HasOtherName))

(defineCaseframe 'Proposition '('HasSymbolicPropertyElement symbolic-property-class thing-with-property symbolic-property-element)
  :docstring "[thing-with-property] has [symbolic-property-element] in [symbolic-property-class]")

(defineCaseframe 'Proposition '('HasQuantity thing-with-quantity quantity)
  :docstring "[thing-with-quantity] has [quantity]")

(defineCaseframe 'Proposition '('HasShape thing-with-shape shape)
     :docstring "[thing-with-shape] has [shape]")

(defineCaseframe 'Proposition '('HasShapeProperty shape shape-property)
     :docstring "[shape] has [shape-property]")

;;; I

; from FrameNet frame: Categorization
(defineCaseframe 'ILO '(actions categorizable-thing)
    :docstring "identify [identifiable-thing]"
    :fsymbols '(identifyILO interpretILO))

(defineCaseframe 'Proposition  '('ILOModifier ilo clause modification)
  :docstring "[clause] of [ilo] is modified by [modification]")

(defineCaseframe 'Proposition  '('ILOQualifier ilo qualification)
  :docstring "[ilo] is qualified by [qualification]")

; from FrameNet frame: Categorization
(defineCaseframe 'ILO '(actions interpretable-thing)
    :docstring "interpret [interpretable-thing]"
    :fsymbols '(interpretILO))

(defineCaseframe 'Modifier '(including inclusion-set)
  :docstring "including [inclusion-set]"
  :fsymbols '(including containing integrating incorporating))

(defineCaseframe 'Proposition '(InDomain domain-predicate domain)
  :docstring "[domain-predicate] relates to, refers to, is expressed in terms belonging to [domain]"
  :fsymbols '(InTermsOf InRelationTo WithReferenceTo WithRegardsTo WithParticularReferenceTo AsAppliedTo))

(defineCaseframe 'Qualifier '(inDomain domain)
  :docstring "in [domain]"
  :fsymbols '(inTermsOf inRelationTo withReferenceTo withRegardsTo withParticularReferenceTo asAppliedTo))

(defineCaseframe 'ILO '(actions act)
  :docstring "intentionally carry out [act]"
  :fsymbols '(intentionallyActILO actILO carryOutILO performILO doILO executeILO))

(defineCaseframe 'Proposition '('InPresenceOf thing-in-presence thing-with-presence)
  :docstring "[thing-in-presence] is in presence of [thing-with-presence]")

; from FrameNet frame: Means
(defineCaseframe 'Proposition '(Means method goal)
  :docstring "[method] is method for achieving [goal]"
  :fsymbols '(IsMethodFor IsMeansFor))

(defineCaseframe 'Proposition '('SubstanceInPhysicalState chemical-substance  physical-state)
  :docstring "[chemical-substance] is in [physical-state]")

(defineState 'ChemicalSubstance '('substanceInPhysicalState chemical-substance physical-state)
  :docstring "[chemical-substance] in [physical-state]")

(defineCaseframe 'Proposition '('Involves involving-entity involvate)
  :docstring "[involving-entity] involves [involvate]")

(defineCaseframe 'Proposition '('IsBalanced chemical-equation)
  :docstring "[chemical-equation] is balanced")

; FrameNet: Causation
(defineCaseframe 'Proposition '(Causation cause effect)
  :docstring "[cause] is cause of [effect] "
  :fsymbols '(IsConsequenceOf IsEffectOf IsResultOf))

(defineCaseframe 'Proposition  '('IsIsotopeOf isotope element)
  :docstring "[isotope] is an isotope of [element]")

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

(defineCaseframe 'Modifier '(modInDomain domain)
  :docstring "[domain]"
  :fsymbols '(modInTermsOf modInRelationTo modWithReferenceTo modWithRegardsTo modWithParticularReferenceTo modAsAppliedTo))

(defineCaseframe 'Proposition '(MolecularConstitution  chemical-entity element)
  :docstring "[chemical-entity] is a compound of [element]"
 :fsymbols '(IsCompoundOf ContainsElement))

;;; N

(defineCaseframe 'Aspect '('namedAspectOfClass aspect class)
  :docstring "[aspect] of [class]")

(defineCaseframe 'Thing '('namedChemicalChangeOfClass chemical-change class)
  :docstring "[chemical-change] of [class]")

(defineCaseframe 'Thing '('namedChemicalPropertyOf chemical-property thing-with-property)
  :docstring "[chemical-property] of [thing-with-property]")

(defineCaseframe 'Property '('namedDerivedPropertyOf derived-property thing-with-property)
  :docstring "[derived-property] of [thing-with-property]")

(defineCaseframe 'Thing '('effectOfInfluenceOn influencing-thing influenced)
  :docstring "effect of [influencing-thing] on [influenced]")

(defineCaseframe 'PhysicalProcess '('namedPhysicalProcessOf physical-process chemical-substance)
  :docstring "[physical-process] of [chemical-substance]")

(defineCaseframe 'Property '('namedNonPhysicalPropertyOf non-physical-property thing-with-property)
  :docstring "[non-physical-property] of [thing-with-property]")

(defineCaseframe 'Property '('namedPhysicalPropertyOf physical-property thing-with-property)
  :docstring "[physical-property] of [thing-with-property]")

(defineCaseframe 'Property '('namedPhysicalPropertyOfClass physical-property class)
  :docstring "[physical-property] of [class]")

(defineCaseframe 'Quantity '('namedQuantityOfClass  class-quantity  class)
  :docstring "[class-quantity] of [class]")

;;; O

(defineCaseframe 'Thing '(objectiveInfluence influencing-entity dependent-entity)
  :docstring "effect of [influencing-entity] on [dependent-entity]"
  :fsymbols '(effectOfOn))

;;; P

(defineCaseframe 'Act '('performActionOn type-of-action object-of-action)
  :docstring "perform [type-of-action] on [object-of-action]")

(defineCaseframe 'PhysicalProperties '('physicalPropertiesOf thing-with-property)
  :docstring "physical properties of [thing-with-property]")

(defineCaseframe 'PhysicalProperties '('physicalPropertiesOfClass class)
  :docstring "physical properties of [class]")

; FrameNet: Predicting
(defineCaseframe 'ILO '(actions eventuality)
  :docstring "predict [eventuality]"
  :fsymbols '(predictILO))

(defineCaseframe 'Properties '('propertiesOf thing-with-property)
  :docstring "properties of [thing-with-property]")

(defineCaseframe 'Properties '('propertiesOfClass class)
  :docstring "properties of [class]")

(defineCaseframe 'Thing '('purpose purpose)
  :docstring "the [purpose]")

;;; Q

(defineCaseframe 'Thing '('namedQuantityOf quantity thing-with-quantity)
  :docstring "[quantity] of [thing-with-quantity")

;;; R

(defineCaseframe 'Thing '('reactivityOf reactive-entity)
  :docstring "reactivity of [reactive-entity]")

(defineCaseframe 'RedoxSystem '('redoxSystem reductant oxidant)
  :docstring "redox system with [reductant] and [oxidant]")

(defineCaseframe 'Thing '('relativeNamedPhysicalPropertyOfClass physical-property class)
  :docstring "relative [physical-property] of [class]") 

(defineCaseframe 'Thing '('relativeReactivityOf reactive-entities)
  :docstring "relative reactivity of [reactive-entities]")

; FrameNet: Removing
(defineCaseframe 'Removal '('removalOfFrom removand removal-source)
  :docstring "removal of [removand] from [removal-source]")

(defineCaseframe 'ILO '(action relate-source relate-sink)
  :docstring "relate [relate-source] to [relate-sink]"
  :fsymbols '(relateToILO))

;;; S

(defineCaseframe 'Thing '('shapeOf thing-with-shape)
  :docstring "shape of a [thing-with-shape]")

(defineCaseframe 'SmallerComparative '('smallerComparative property)
  :docstring "smaller comparative of [property]")

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

(defineCaseframe 'ChemicalSubstance '('chemicalSubstanceInPhysicalState chemical-substance physical-state)
  :docstring "[chemical-substance] in [physical-state]")

;;; T

(defineCaseframe 'Thing '('trendInPropertyOf trending-property things-with-trending-property)
  :docstring "trend in [trending-property] of [things-with-trending-property]")

(defineCaseframe 'Thing '('typedChemicalReactionOfClass reaction-type reactant-class)
  :docstring "[reaction-type] of [reactant-class]")

;;; U

(defineCaseframe 'Thing '('underlyingAssumptionsOf thing-with-assumptions)
  :docstring "underlying assumptions of [thing-with-assumptions]")

(defineCaseframe 'ILO '(actions instrument)
  :docstring "use [instrument]"
  :fsymbols '(useILO applyILO employILO operateILO))

(defineCaseframe 'Thing '('useOf instrument)
  :docstring "use of [instrument]")

(defineCaseframe 'Thing '('useAndCircumstanceOf instrument circumstances-of-use)
  :docstring "use of [instrument] with [circumstances-of-use]")

(defineCaseframe 'Thing '('usesOfClass class)
  :docstring "uses of [class]")



;;; V

(defineCaseframe 'Thing '('variationIn quantity)
 :docstring "variation in  [quantity]")

(defineCaseframe 'Thing '('variationInPhysicalPropertyOf property thing-wth-property)
 :docstring "variation in  [property] of [thing-with-property]")

(defineCaseframe 'Thing '('variationInPhysicalPropertyOfClass property class)
 :docstring "variation in  [property] of [class]")

(defineCaseframe 'Thing '('valueOf quantity)
 :docstring "value of [quantity]")

;;; W

(defineCaseframe 'Qualifier '(examples example)
  :docstring "with [example]"
  :fsymbols '(withExample asExample includingExample))

(defineCaseframe 'Qualifier '('byMeans means)
  :docstring "by [means] ")

(defineCaseframe 'ILO '(actions writable)
    :docstring "write [writable]"
    :fsymbols '(writeILO))

;;; X

;;; Y

;;; Z
