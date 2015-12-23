
;;; A

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '(actions analysandum)
  :docstring "Analyse [analysandum]"
  :fsymbols '(AnalyseILO))

(defineCaseframe 'Act '('AlterPropertyOf type-of-alteration property thing-with-property)
  :docstring "make [type-of-alteration] to [property] of [thing-with-property]")

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
    :docstring "Calculate [object-of-calculation]",
    :fsymbols '(CalculateILO))

(defineCaseframe 'Thing '('ChangeIn thing-with-change)
  :docstring "change in [thing-with-change]")

(defineCaseframe 'Proposition '(Circumstancing entity-with-circumstances circumstances)
    :docstring "[entity-with-circumstances] takes place in [circumstances]"
    :fsymbols '(inCircumstances inSystem inChemicalSystem))

(defineCaseframe 'Thing '('ClassBehaviorOf class-with-behavior)
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

;;; D

(defineCaseframe 'ILO '(actions definable-thing)
  :docstring "Define [definable-thing]"
  :fsymbols '(DefineILO))

(defineCaseframe 'ILO '(actions describable-thing)
  :docstring "Describe [describable-thing]"
  :fsymbols '(DescribeILO OutlineILO))

(defineCaseframe 'ILO '(actions content)
    :docstring "deduce [content]"
    :fsymbols '(DeduceILO  WorkOutILO DeriveILO AscertainILO DetermineILO FigureOutILO InferILO PuzzleOutILO SurmiseILO DeduceHowILO))

(defineCaseframe 'Thing '('DeterminationOf thing-to-be-determined)
  :docstring "determination of [thing-to-be-determined]")

(defineCaseframe 'Thing '('DistributionOf thing-with-distribution locality-of-distribution)
  :docstring "the distribution of [thing-with-distribution] over [locality-of-distribution]")

(defineCaseframe 'Thing '('Domain domain)
  :docstring "the [domain]")




;;; E

(defineCaseframe 'Thing '('EffectOfOn influence object-of-influence)
  :docstring "effect of [influence] on [object-of-influence]")

(defineCaseframe 'ILO '(actions entity-with-explanation)
    :docstring "Explain the [entity-with-explanation]"
    :fsymbols '(Explain ExplainWhy AccountFor ExplainTerm ExplainAndUseTerm))

;;; F

;;; G

(defineCaseframe 'GreaterComparative '('GreaterComparative property)
  :docstring "greater comparative of [property]")

;;; H

(defineCaseframe 'Proposition '('hasClassName nameable-class class-name)
  :docstring "[namable-class] has [class-name]")

(defineCaseframe 'Proposition '(hasName nameable-thing thing-name)
  :docstring "[nameable-thing] has [thing-name]"
  :fsymbols '(hasSystematicName hasIupacName hasIupacNameSubstitutive 
              hasIupacNameAdditive hasAcceptableCommonName hasPreferredIupacName 
              hasGeneralIupacName hasRetainedIupacName hasTrivialName hasAtomName 
              hasElementName hasMoleculeName hasSubstanceName hasOtherName))

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
  :fsymbols '(inTermsOf inRelationTo withReferenceTo withRegardsTo withParticularReferenceTo))

(defineCaseframe 'ILO '(actions act)
  :docstring "intentionally carry out [act]"
  :fsymbols '(IntentionallyActILO ActILO CarryOutILO PerformILO DoILO ExecuteILO))

(defineCaseframe 'Proposition '('inPresenceOf thing-in-presence thing-with-presence)
  :docstring "[thing-in-presence] is in presence of [thing-with-presence]")

;;; J

;;; K

;;; L

;;; M

(defineCaseframe 'Modifier '(modInDomain domain)
  :docstring "[domain]"
  :fsymbols '(modInTermsOf modInRelationTo modWithReferenceTo modWithRegardsTo modWithParticularReferenceTo))

;;; N

(defineCaseframe 'Thing '('NamedNonPhysicalPropertyOf non-physical-property thing-with-property)
  :docstring "[thing-wth-property] has [non-physical-property]")

(defineCaseframe 'Thing '('NamedPhysicalPropertyOf physical-property thing-with-property)
  :docstring "[thing-wth-property] has [physical-property]")

;;; O

(defineCaseframe 'Thing '(ObjectiveInfluence influencing-entity dependent-entity)
  :docstring "effect of [influencing-entity] on [dependent-entity]"
  :fsymbols '(EffectOfOn))

;;; P

(defineCaseframe 'Act '('PerformActionOn type-of-action object-of-action)
  :docstring "perform [type-of-action] on [object-of-action]")

(defineCaseframe 'Thing '('PropertiesOf thing-with-property)
  :docstring "properties of [thing-with-property]")

(defineCaseframe 'Thing '('Purpose purpose)
  :docstring "the [purpose]")

;;; Q

;;; R

(defineCaseframe 'Thing '('ReactivityOf reactive-entity)
  :docstring "reactivity of [reactive-entity]")

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





;;; V

;;; W

(defineCaseframe 'ILO '(actions writable)
    :docstring "write [writable]"
    :fsymbols '(WriteILO))

;;; X

;;; Y

;;; Z
