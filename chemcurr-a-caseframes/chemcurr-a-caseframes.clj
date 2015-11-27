
;;; A

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "Every [subclass] is a [superclass]")

(defineCaseframe 'ILO '('actions analysandum)
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

;;; C

(defineCaseframe 'ILO '(actions object-of-calculation)
    :docstring "Calculate [object-of-calculation]",
    :fsymbols '(CalculateILO))

(defineCaseframe 'Proposition '(Circumstancing entity-with-circumstances circumstances)
    :docstring "[entity-with-circumstances] takes place in [circumstances]"
    :fsymbols '(inCircumstances inSystem inChemicalSystem))

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

(defineCaseframe 'Thing '('DistributionOf thing-with-distribution locality-of-distribution)
  :docstring "the distribution of [thing-with-distribution] over [locality-of-distribution]")

(defineCaseframe 'Thing '('Domain domain)
  :docstring "the [domain]")




;;; E

(defineCaseframe 'ILO '(actions entity-with-explanation)
    :docstring "Explain the [entity-with-explanation]"
    :fsymbols '(Explain ExplainWhy AccountFor ExplainTerm ExplainAndUseTerm))

;;; F

;;; G

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

;;; N

(defineCaseframe 'Thing '('NonPhysicalPropertyOf non-physical-property thing-with-property)
  :docstring "[thing-wth-property] has [non-physical-property]")

;;; O

(defineCaseframe 'Thing '(ObjectiveInfluence influencing-entity dependent-entity)
  :docstring "effect of [influencing-entity] on [dependent-entity]"
  :fsymbols '(EffectOfOn))

;;; P

(defineCaseframe 'Thing '('Purpose purpose)
  :docstring "the [purpose]")

;;; Q

;;; R

(defineCaseframe 'Thing '(ReactivityOf reactive-entity)
  :docstring "reactivity of [reactive-entity]")

;;; S

(defineCaseframe 'Thing '('ShapeOf thing-with-shape)
     :docstring "shape of a [thing-with-shape]")

(defineCaseframe 'ILO '(actions topic)
  :docstring "summarise [topic]"
  :fsymbols '(SummariseILO OutlineILO SumUpILO ProvideSynopsisOfILO))

(defineCaseframe 'ILO '(actions statable-thing)
    :docstring "state [statable-thing]"
    :fsymbols '(StateILO WriteILO WriteDownILO ProposeILO RecountILO ReportILO SuggestILO RelateILO))

;;; T

;;; U

(defineCasefrme 'Thing '('UnderlyingAssumptionsOf assumption-set)
  :docstring "underlying assumptions of [assumption-set]")

(defineCaseframe 'ILO '(actions instrument)
  :docstring "Use [instrument]"
  :fsymbols '(UseILO ApplyILO EmployILO OperateILO))

(defineCasefrane 'Thing '('UseOf instrument)
  :docstring "use of [instrument]")

(defineCasefrane 'Thing '('UseOf instrument circumstances-of-use)
  :docstring "use of [instrument] with [circumstances-of-use]")





;;; V

;;; W

(defineCaseframe 'ILO '(actions writable)
    :docstring "write [writable]"
    :fsymbols '(WriteILO))

;;; X

;;; Y

;;; Z
