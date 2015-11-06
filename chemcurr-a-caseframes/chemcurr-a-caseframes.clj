
(defineCaseframe 'Proposition '('hasClassName namable-class class-name)
  :docstring "[namable-class] has [class-name]")

(defineSlot subclass :type Category :negadjust reduce
            :path (compose ! subclass (kstar (compose superclass- ! subclass)))
            :docstring "Subcategories of some category/ies.")
(defineSlot superclass :type Category :negadjust reduce
            :path (compose ! superclass (kstar (compose subclass- ! superclass)))
            :docstring "Supercategories of some category/ies.")
(definePath 'class '(compose ! class (kstar (compose subclass- ! superclass))))
(definePath 'member '(compose ! member (kstar (compose equiv- ! equiv))))

(defineCaseframe 'Proposition '('Ako subclass superclass)
  :docstring "every [subclass] is a [superclass]")

(defineCaseframe 'Proposition '(hasEntityName namable-entity entity-name)
  :docstring "[namable-entity] has [entity-name]"
  :fsymbols '(hasName hasSystematicName hasIupacName hasIupacNameSubstitutive 
              hasIupacNameAdditive hasAcceptableCommonName hasPreferredIupacName 
              hasGeneralIupacName hasRetainedIupacName hasTrivialName hasAtomName 
              hasElementName hasMoleculeName hasSubstanceName hasOtherName))
