
;;; A

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '(actions analysandum)
  :docstring "Analyse [analysandum]"
  :fsymbols '(AnalyseILO))

(defineCaseframe 'Act '('AlterPropertyOf type-of-alteration property thing-with-property)
  :docstring "make [type-of-alteration] to [property] of [thing-with-property]")

; FrameNet: derived from Arriving
(defineCaseframe 'Thing '(Arrival arriving-thing thing-arrived-at)
  :docstring "arrival of [arriving-thing] at  [thing-arived-at]"
  :fsymbols '(ApproachOfTo ArrivalAt))

(defineCaseframe 'Thing '('AssumptionsOf thing-with-assumptions)
  :docstring "assumptions of  [thing-with-assumptions]")

;;; B

(defineCaseframe 'Proposition '(Basing entity-with-base base)
    :docstring "[entity-with-base] is based on [base]"
    :fsymbols '(BasedOn BuiltOn ConstructedOn))

(defineCaseframe 'Thing '('BeamOf beam-constituent)
  :docstring "a beam of [beam-constituent]s")

(defineCaseframe 'Thing '('BehaviorOf thing-with-behavior)
  :docstring "behavior of [thing-with-behavior]")

(defineCaseframe 'Means '('byReactionOf reactants)
  :docstring "by reaction of [reactants]")

;;; C

(defineCaseframe 'ILO '(actions object-of-calculation)
    :docstring "calculate [object-of-calculation]"
    :fsymbols '(CalculateILO))

(defineCaseframe 'Thing '('CardinalityOf thing-with-cardinality)
  :docstring "cardinality of [thing-with-cardinality]")

(defineCaseframe 'Thing '('ChangeIn thing-with-change)
  :docstring "change in [thing-with-change]")

(defineCaseframe 'Proposition '(Circumstancing entity-with-circumstances circumstances)
    :docstring "[entity-with-circumstances] takes place in [circumstances]"
    :fsymbols '(inCircumstances inSystem inChemicalSystem))

(defineCaseframe 'Thing '('BehaviorOfClass class-with-behavior)
  :docstring "behavior of [class-with-behavior]")

(defineCaseframe 'Thing '('ClassPhysicalPropertiesOf class-with-physical-properties)
  :docstring "physical properties of [class-with-physical-properties]")

(defineCaseframe 'Thing '('ClassPropertiesOf class-with-properties)
  :docstring "properties of [class-with-properties]")

(defineCaseframe 'Comparative '('ComparativeOf comparative-sense  comparative-thing)
  :docstring "comparative of [comparative-thing] in [comparative-sense]")

(defineCaseframe 'ILO '(actions comparison-set)
  :docstring "compare [comparison-set]"
  :fsymbols '(CompareILO MatchILO))

(defineCaseframe 'Thing '('ConditionsFor thing-with-conditions)
  :docstring "conditions for [thing-with-conditions]")

;;; D

(defineCaseframe 'Thing '('Data thing-with-data)
  :docstring "data on [thing-with-data]")

(defineCaseframe 'ILO '(actions definable-thing)
  :docstring "Define [definable-thing]"
  :fsymbols '(DefineILO))

(defineCaseframe 'ILO '(actions definable-thing modification)
  :docstring "Define [definable-thing] with [modification]"
  :fsymbols '(DefineILO2))

(defineCaseframe 'ILO '(actions describable-thing)
  :docstring "Describe [describable-thing]"
  :fsymbols '(DescribeILO OutlineILO))

(defineCaseframe 'ILO '(actions deducible-entity)
    :docstring "deduce [deducible-entity]"
    :fsymbols '(DeduceILO  WorkOutILO DeriveILO AscertainILO DetermineILO FigureOutILO InferILO PuzzleOutILO SurmiseILO DeduceHowILO))

; FrameNet: derived from Departing
(defineCaseframe 'Thing '(Departure thing-departing thing-departed-from)
  :docstring "departure of [departing-thing] from [thing-departed-from]"
  :fsymbols '(DepartureOfFrom))

(defineCaseframe 'Thing '('DeterminationOf thing-to-be-determined)
  :docstring "determination of [thing-to-be-determined]")

(defineCaseframe 'ILO '(action discussible-thing)
  :docstring "discuss [discussible-thing]"
  :fsymbol '(DiscussILO))

(defineCaseframe 'ILO '(action distinguishable-things)
  :docstring "distinguish between [distinguishable-things]"
  :fsymbol '(DistinguishBetweenILO))

(defineCaseframe 'Thing '('DistributionOf thing-with-distribution)
  :docstring "the distribution of [thing-with-distribution]")

(defineCaseframe 'Thing '('Domain domain)
  :docstring "the [domain]")




;;; E

(defineCaseframe 'Thing '('ElectronicConfigurationOf chemical-entity)
  :docstring "electronic configuration of [chemical entity]")

(defineCaseframe 'Thing '('EffectOfOn influence object-of-influence)
  :docstring "effect of [influence] on [object-of-influence]")

(defineCaseframe 'ILO '(actions entity-with-explanation)
    :docstring "Explain the [entity-with-explanation]"
    :fsymbols '(Explain ExplainWhy AccountFor ExplainTerm ExplainAndUseTerm))

;;; F

;;; G

(defineCaseframe 'Modifier '('Given thing-given)
 :docstring "given [thing-given]")

(defineCaseframe 'GreaterComparative '('GreaterComparative property)
  :docstring "greater comparative of [property]")

;;; H

(defineCaseframe 'Proposition '('hasClassName nameable-class class-name)
  :docstring "[namable-class] has [class-name]")

(defineCaseframe 'Proposition '('hasElectronicConfiguration chemical-referent electronic-configuration)
  :docstring "[chemical-referent] has [electronic-configuration]")

(defineCaseframe 'Proposition '('hasElectrostaticCharge thing-with-charge sign magnitude)
  :docstring "[thing-with-charge] has charge of [sign] and [magnitude]")

(defineCaseframe 'Proposition '(hasName nameable-thing thing-name)
  :docstring "[nameable-thing] has [thing-name]"
  :fsymbols '(hasSystematicName hasIupacName hasIupacNameSubstitutive 
              hasIupacNameAdditive hasAcceptableCommonName hasPreferredIupacName 
              hasGeneralIupacName hasRetainedIupacName hasTrivialName hasAtomName 
              hasElementName hasMoleculeName hasSubstanceName hasOtherName))

(defineCaseframe 'Proposition '('hasSymbolicPropertyElement symbolic-property-class thing-with-property symbolic-property-element)
  :docstring "[thing-with-property] has [symbolic-property-element] in [symbolic-property-class]")

(defineCaseframe 'Proposition '('hasQuantity thing-with-quantity quantity)
  :docstring "[thing-with-quantity] has [quantity]")

(defineCaseframe 'Proposition '('hasShape thing-with-shape shape)
     :docstring "[thing-with-shape] has [shape]")

(defineCaseframe 'Proposition '('hasShapeProperty shape shape-property)
     :docstring "[shape] has [shape-property]")

;;; I

(defineCaseframe 'ILO '(actions identifiable-thing)
    :docstring "identify [identifiable-thing]"
    :fsymbols '(IdentifyILO))

(defineCaseframe 'Proposition  '('ILOModifier ilo clause modification)
  :docstring "[clause] of [ilo] is modified by [modification]")

(defineCaseframe 'Proposition  '('ILOQualifier ilo qualification)
  :docstring "[ilo] is qualified by [qualification]")

(defineCaseframe 'Proposition '(Inclusion inclusion-set)
  :docstring "including [inclusion-set]"
  :fsymbols '(Including Containing Integrating Incorporating))

(defineCaseframe 'Proposition '(inDomain domain-predicate domain)
  :docstring "[domain-predicate] relates to, refers to, is expressed in terms belonging to [domain]"
  :fsymbols '(inTermsOf inRelationTo withReferenceTo withRegardsTo withParticularReferenceTo asAppliedTo))

(defineCaseframe 'ILO '(actions act)
  :docstring "intentionally carry out [act]"
  :fsymbols '(IntentionallyActILO ActILO CarryOutILO PerformILO DoILO ExecuteILO))

(defineCaseframe 'Proposition '('inPresenceOf thing-in-presence thing-with-presence)
  :docstring "[thing-in-presence] is in presence of [thing-with-presence]")

(defineCaseframe 'Proposition '('inPhysicalState physical-state chemical-substance)
  :docstring "[chemical-substance] in [physical-state]")

(defineCaseframe 'Proposition '('Involves involving-entity involvate)
  :docstring "[involving-entity] involves [involvate]")

(defineCaseframe 'Proposition '('isBalanced chemical-equation)
  :docstring "[chemical-equation] is balanced")

(defineCaseframe 'Proposition  '('IsotopeOf isotope element)
  :docstring "[isotope] is an isotope of [element]")

;;; J

;;; K

;;; L

;;; M

(defineCaseframe 'Modifier '(modInDomain domain)
  :docstring "[domain]"
  :fsymbols '(modInTermsOf modInRelationTo modWithReferenceTo modWithRegardsTo modWithParticularReferenceTo modAsAppliedTo))

;;; N

(defineCaseframe 'Thing '('NamedChemicalPropertyOf chemical-property thing-with-property)
  :docstring "[chemical-property] of [thing-with-property]")

(defineCaseframe 'Thing '('NamedDerivedPropertyOf derived-property thing-with-property)
  :docstring "[derived-property] of [thing-with-property]")

(defineCaseframe 'Thing '('NamedNonPhysicalPropertyOf non-physical-property thing-with-property)
  :docstring "[non-physical-property] of [thing-with-property]")

(defineCaseframe 'Thing '('NamedPhysicalPropertyOf physical-property thing-with-property)
  :docstring "[physical-property] of [thing-with-property]")


(defineCaseframe 'Thing '('NamedQuantityOfClass  class-quantity  class)
  :docstring "[class-quantity] of [class]")

;;; O

(defineCaseframe 'Thing '(ObjectiveInfluence influencing-entity dependent-entity)
  :docstring "effect of [influencing-entity] on [dependent-entity]"
  :fsymbols '(EffectOfOn))

;;; P

(defineCaseframe 'Act '('PerformActionOn type-of-action object-of-action)
  :docstring "perform [type-of-action] on [object-of-action]")

(defineCaseframe 'Thing '('PhysicalPropertiesOf thing-with-property)
  :docstring "physical properties of [thing-with-property]")

(defineCaseframe 'Thing '('PhysicalPropertiesOfClass class)
  :docstring "physical properties of [class]")

(defineCaseframe 'Thing '('PropertiesOf thing-with-property)
  :docstring "properties of [thing-with-property]")

(defineCaseframe 'Thing '('Purpose purpose)
  :docstring "the [purpose]")

;;; Q

(defineCaseframe 'Thing '('NamedQuantityOf quantity thing-with-quantity)
  :docstring "the [quantity] of [thing-with-quantity")

;;; R

(defineCaseframe 'Thing '('ReactivityOf reactive-entity)
  :docstring "reactivity of [reactive-entity]")

(defineCaseframe 'ILO '(action relate-source relate-sink)
  :docstring "relate [relate-source] to [relate-sink]"
  :fsymbols '(RelateToILO))

;;; S

(defineCaseframe 'Thing '('ShapeOf thing-with-shape)
  :docstring "shape of a [thing-with-shape]")

(defineCaseframe 'SmallerComparative '('SmallerComparative property)
  :docstring "smaller comparative of [property]")

(defineCaseframe 'ILO '(actions topic)
  :docstring "summarise [topic]"
  :fsymbols '(SummariseILO OutlineILO SumUpILO ProvideSynopsisOfILO))

(defineCaseframe 'Thing '('StabilisationOf stabilised-thing)
  :docstring "stabilisation of [stabilised-thing]")

(defineCaseframe 'Thing '('StabilisationOfBy stabilised-thing stabilisation-agency)
  :docstring "stabilisation of [stabilised-thing] through [stabilisation-agency]")

(defineCaseframe 'ILO '(actions statable-thing)
  :docstring "state [statable-thing]"
  :fsymbols '(StateILO WriteILO WriteDownILO ProposeILO RecountILO ReportILO SuggestILO RelateILO))

;;; T

(defineCaseframe 'Thing '('TypedChemicalReactionOfClass reaction-type reactant-class)
  :docstring "[reaction-type] of [reactant-class]")

;;; U

(defineCaseframe 'Thing '('UnderlyingAssumptionsOf assumption-set)
  :docstring "underlying assumptions of [assumption-set]")

(defineCaseframe 'ILO '(actions instrument)
  :docstring "use [instrument]"
  :fsymbols '(UseILO ApplyILO EmployILO OperateILO))

(defineCaseframe 'Thing '('UseOf instrument)
  :docstring "use of [instrument]")

(defineCaseframe 'Thing '('UseAndCircumstanceOf instrument circumstances-of-use)
  :docstring "use of [instrument] with [circumstances-of-use]")

(defineCaseframe 'Thing '('UsesOfClass class)
  :docstring "uses of [class]")



;;; V

(defineCaseframe 'Thing '('ValueOf quantity)
 :docstring "value of [quantity]")

;;; W

(defineCaseframe 'ILO '(actions writable)
    :docstring "write [writable]"
    :fsymbols '(WriteILO))

;;; X

;;; Y

;;; Z
