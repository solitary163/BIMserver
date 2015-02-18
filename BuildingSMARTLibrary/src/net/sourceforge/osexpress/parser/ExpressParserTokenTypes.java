package net.sourceforge.osexpress.parser;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

public enum ExpressParserTokenTypes {
	/**
	 * SKIP was originally in antlr.Token
	 */
	SKIP(-1),

	EOF(1),
	NULL_TREE_LOOKAHEAD(3),
	CONSTANT_IDENT(4),
	ENTITY_IDENT(5),
	FUNCTION_IDENT(6),
	PROCEDURE_IDENT(7),
	PARAMETER_IDENT(8),
	SCHEMA_IDENT(9),
	TYPE_IDENT(10),
	VARIABLE_IDENT(11),
	ENUMERATION_IDENT(12),
	ATTRIBUTE_IDENT(13),
	ENTITY_ATTR_IDENT(14),
	TYPE_ATTR_IDENT(15),
	ENTITY_VAR_IDENT(16),
	TYPE_VAR_IDENT(17),
	ENTITY_PARAM_IDENT(18),
	TYPE_PARAM_IDENT(19),
	SUBTYPE_CONSTRAINT_ID(20),
	ACTUAL_PARAMETER_LIST(21),
	ADD_LIKE_OP(22),
	AGGREGATE_INITIALIZER(23),
	AGGREGATE_SOURCE(24),
	AGGREGATE_TYPE(25),
	AGGREGATION_TYPES(26),
	ALGORITHM_HEAD(27),
	ALIAS_STMT(28),
	ARRAY_TYPE(29),
	ASSIGNMENT_STMT(30),
	BAG_TYPE(31),
	BASE_TYPE(32),
	BINARY_TYPE(33),
	BOOLEAN_TYPE(34),
	BOUND_1(35),
	BOUND_2(36),
	BOUND_SPEC(37),
	BUILT_IN_CONSTANT(38),
	BUILT_IN_FUNCTION(39),
	BUILT_IN_PROCEDURE(40),
	CASE_ACTION(41),
	CASE_LABEL(42),
	CASE_STMT(43),
	COMPOUND_STMT(44),
	CONSTANT_BODY(45),
	CONSTANT_DECL(46),
	CONSTANT_FACTOR(47),
	CONSTANT_ID(48),
	DECLARATION(49),
	DOMAIN_RULE(50),
	ELEMENT(51),
	ENTITY_HEAD(52),
	ENTITY_DECL(53),
	ENTITY_BODY(54),
	SUBSUPER(55),
	SUPERTYPE_CONSTRAINT(56),
	ABSTRACT_SUPERTYPE_DECLARATION(57),
	SUBTYPE_DECLARATION(58),
	EXPLICIT_ATTR(59),
	ATTRIBUTE_DECL(60),
	ATTRIBUTE_ID(61),
	QUALIFIED_ATTRIBUTE(62),
	DERIVE_CLAUSE(63),
	DERIVED_ATTR(64),
	INVERSE_CLAUSE(65),
	INVERSE_ATTR(66),
	UNIQUE_CLAUSE(67),
	UNIQUE_RULE(68),
	REFERENCED_ATTRIBUTE(69),
	ENTITY_CONSTRUCTOR(70),
	ENTITY_ID(71),
	ENUMERATION_REFERENCE(72),
	ESCAPE_STMT(73),
	EXPRESSION(74),
	FACTOR(75),
	FORMAL_PARAMETER(76),
	ATTRIBUTE_QUALIFIER(77),
	FUNCTION_CALL(78),
	FUNCTION_DECL(79),
	FUNCTION_HEAD(80),
	FUNCTION_ID(81),
	GENERALIZED_TYPES(82),
	GENERAL_AGGREGATION_TYPES(83),
	GENERAL_ARRAY_TYPE(84),
	GENERAL_BAG_TYPE(85),
	GENERAL_LIST_TYPE(86),
	GENERAL_REF(87),
	GENERAL_SET_TYPE(88),
	GENERIC_TYPE(89),
	GROUP_QUALIFIER(90),
	IF_STMT(91),
	INCREMENT(92),
	INCREMENT_CONTROL(93),
	INDEX(94),
	INDEX_1(95),
	INDEX_2(96),
	INDEX_QUALIFIER(97),
	INTEGER_TYPE(98),
	INTERVAL(99),
	INTERVAL_HIGH(100),
	INTERVAL_ITEM(101),
	INTERVAL_LOW(102),
	INTERVAL_OP(103),
	LABEL(104),
	LIST_TYPE(105),
	LITERAL(106),
	REAL(107),
	INTEGER(108),
	STRING_LITERAL(109),
	LOCAL_DECL(110),
	LOCAL_VARIABLE(111),
	LOGICAL_EXPRESSION(112),
	LOGICAL(113),
	LOGICAL_TYPE(114),
	MULTIPLICATION_LIKE_OP(115),
	NAMED_TYPES(116),
	NULL_STMT(117),
	NUMBER_TYPE(118),
	NUMERIC_EXPRESSION(119),
	ONE_OF(120),
	PARAMETER(121),
	PARAMETER_ID(122),
	PARAMETER_TYPE(123),
	POPULATION(124),
	PRECISION_SPEC(125),
	PRIMARY(126),
	PROCEDURE_CALL_STMT(127),
	PROCEDURE_DECL(128),
	PROCEDURE_HEAD(129),
	PROCEDURE_ID(130),
	QUALIFIABLE_FACTOR(131),
	QUALIFIER(132),
	QUERY_EXPRESSION(133),
	REAL_TYPE(134),
	REFERENCE_CLAUSE(135),
	REL_OP(136),
	REL_OP_EXTENDED(137),
	REPEAT_CONTROL(138),
	REPEAT_STMT(139),
	REPETITION(140),
	RESOURCE_OR_RENAME(141),
	RESOURCE_REF(142),
	RETURN_STMT(143),
	RULE_DECL(144),
	RULE_HEAD(145),
	RULE_ID(146),
	SCHEMA_ID(147),
	SCHEMA_BODY(148),
	SCHEMA_DECL(149),
	INTERFACE_SPECIFICATION(150),
	USE_CLAUSE(151),
	NAMED_TYPE_OR_RENAME(152),
	SELECTOR(153),
	SET_TYPE(154),
	SIMPLE_EXPRESSION(155),
	SIMPLE_FACTOR(156),
	SIMPLE_TYPES(157),
	SKIP_STMT(158),
	STMT(159),
	STRING_TYPE(160),
	SUBTYPE_CONSTRAINT(161),
	SUPERTYPE_EXPRESSION(162),
	SUPERTYPE_FACTOR(163),
	SUPERTYPE_RULE(164),
	SUPERTYPE_TERM(165),
	SYNTAX(166),
	TERM(167),
	TYPE_DECL(168),
	UNDERLYING_TYPE(169),
	CONSTRUCTED_TYPES(170),
	ENUMERATION_TYPE(171),
	ENUMERATION_ID(172),
	SELECT_TYPE(173),
	TYPE_ID(174),
	TYPE_LABEL(175),
	TYPE_LABEL_ID(176),
	UNARY_OP(177),
	UNTIL_CONTROL(178),
	VARIABLE_ID(179),
	WHERE_CLAUSE(180),
	WHILE_CONTROL(181),
	WIDTH(182),
	WIDTH_SPEC(183),
	ENTITY_REF(184),
	TYPE_REF(185),
	ENUMERATION_REF(186),
	ATTRIBUTE_REF(187),
	CONSTANT_REF(188),
	FUNCTION_REF(189),
	PARAMETER_REF(190),
	VARIABLE_REF(191),
	SCHEMA_REF(192),
	TYPE_LABEL_REF(193),
	PROCEDURE_REF(194),
	SIMPLE_ID(195),
	ELSE_CLAUSE(196),
	RENAME_ID(197),
	ENUMERATION_ITEMS(198),
	ENUMERATION_EXTENSION(199),
	SELECT_LIST(200),
	SELECT_EXTENSION(201),
	REDECLARED_ATTRIBUTE(202),
	SUBTYPE_CONSTRAINT_DECL(203),
	SUBTYPE_CONSTRAINT_HEAD(204),
	SUBTYPE_CONSTRAINT_BODY(205),
	ABSTRACT_SUPERTYPE(206),
	TOTAL_OVER(207),
	CONCRETE_TYPES(208),
	GENERIC_ENTITY_TYPE(209),
	SCHEMA_VERSION_ID(210),
	LANGUAGE_VERSION_ID(211),
	LPAREN(212),
	COMMA(213),
	RPAREN(214),
	PLUS(215),
	MINUS(216),
	LITERAL_or(217),
	LITERAL_xor(218),
	LBRACK(219),
	RBRACK(220),
	LITERAL_aggregate(221),
	COLON(222),
	LITERAL_of(223),
	LITERAL_alias(224),
	LITERAL_for(225),
	IDENT(226),
	SEMI(227),
	LITERAL_end_alias(228),
	LITERAL_array(229),
	LITERAL_optional(230),
	LITERAL_unique(231),
	COLEQ(232),
	LITERAL_bag(233),
	LITERAL_binary(234),
	LITERAL_boolean(235),
	LITERAL_const_e(236),
	LITERAL_pi(237),
	LITERAL_self(238),
	QUESTION(239),
	STAR(240),
	LITERAL_abs(241),
	LITERAL_acos(242),
	LITERAL_asin(243),
	LITERAL_atan(244),
	LITERAL_blength(245),
	LITERAL_cos(246),
	LITERAL_exists(247),
	LITERAL_exp(248),
	LITERAL_format(249),
	LITERAL_hibound(250),
	LITERAL_hiindex(251),
	LITERAL_length(252),
	LITERAL_lobound(253),
	LITERAL_loindex(254),
	LITERAL_log(255),
	LOG2(256),
	LOG10(257),
	LITERAL_nvl(258),
	LITERAL_odd(259),
	LITERAL_rolesof(260),
	LITERAL_sin(261),
	LITERAL_sizeof(262),
	LITERAL_sqrt(263),
	LITERAL_tan(264),
	LITERAL_typeof(265),
	LITERAL_usedin(266),
	LITERAL_value(267),
	LITERAL_value_in(268),
	LITERAL_value_unique(269),
	LITERAL_insert(270),
	LITERAL_remove(271),
	LITERAL_case(272),
	LITERAL_otherwise(273),
	LITERAL_end_case(274),
	LITERAL_begin(275),
	LITERAL_end(276),
	LITERAL_constant(277),
	LITERAL_end_constant(278),
	LITERAL_entity(279),
	LITERAL_abstract(280),
	LITERAL_end_entity(281),
	LITERAL_supertype(282),
	LITERAL_subtype(283),
	LITERAL_end_subtype_constraint(284),
	LITERAL_subtype_constraint(285),
	LITERAL_total_over(286),
	LITERAL_renamed(287),
	LITERAL_derive(288),
	LITERAL_inverse(289),
	LITERAL_set(290),
	DOT(291),
	LITERAL_escape(292),
	DOUBLESTAR(293),
	LITERAL_end_function(294),
	LITERAL_function(295),
	LITERAL_list(296),
	LITERAL_generic(297),
	LITERAL_generic_entity(298),
	BACKSLASH(299),
	LITERAL_if(300),
	LITERAL_then(301),
	LITERAL_end_if(302),
	LITERAL_else(303),
	LITERAL_to(304),
	LITERAL_by(305),
	LITERAL_integer(306),
	LCURLY(307),
	RCURLY(308),
	LT(309),
	LE(310),
	INT(311),
	FLOAT(312),
	STRING(313),
	LITERAL_local(314),
	LITERAL_end_local(315),
	LITERAL_false(316),
	LITERAL_true(317),
	LITERAL_unknown(318),
	LITERAL_logical(319),
	DIVSIGN(320),
	LITERAL_div(321),
	LITERAL_mod(322),
	LITERAL_and(323),
	DOUBLEBAR(324),
	LITERAL_number(325),
	LITERAL_oneof(326),
	LITERAL_end_procedure(327),
	LITERAL_procedure(328),
	LITERAL_var(329),
	LITERAL_query(330),
	LTSTAR(331),
	BAR(332),
	LITERAL_real(333),
	LITERAL_reference(334),
	LITERAL_from(335),
	GT(336),
	GE(337),
	LTGT(338),
	ASSIGN(339),
	COLLTGT(340),
	COLEQCOL(341),
	LITERAL_in(342),
	LITERAL_like(343),
	LITERAL_repeat(344),
	LITERAL_end_repeat(345),
	LITERAL_as(346),
	LITERAL_return(347),
	LITERAL_end_rule(348),
	LITERAL_rule(349),
	LITERAL_schema(350),
	LITERAL_end_schema(351),
	LITERAL_use(352),
	LITERAL_skip(353),
	LITERAL_string(354),
	LITERAL_andor(355),
	LANG_VERSION(356),
	LITERAL_type(357),
	LITERAL_end_type(358),
	LITERAL_extensible(359),
	LITERAL_enumeration(360),
	LITERAL_based_on(361),
	LITERAL_with(362),
	LITERAL_select(363),
	LITERAL_not(364),
	LITERAL_until(365),
	LITERAL_where(366),
	LITERAL_while(367),
	LITERAL_fixed(368),
	COMMENT(369),
	LINECOMMENT(370),
	AMPERSAND(371),
	AT(372),
	WS(373),
	DIGIT(374);

	private int index;

	private ExpressParserTokenTypes(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}

	public static ExpressParserTokenTypes getToken(int tokenIndex) {
		for (ExpressParserTokenTypes t : ExpressParserTokenTypes.values()) {
			if (t.getIndex() == tokenIndex)
				return t;
		}
		throw new IllegalArgumentException(String.format("ExpressParserTokenTypes does not have a Token with an index of %s", tokenIndex));
	}
}
