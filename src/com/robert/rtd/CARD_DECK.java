package com.robert.rtd;

public enum CARD_DECK {

    // This enum was developed prior to my understanding of enum ordinals and enum sets. In retrospect,
    // I would have made this enum as an enum set and use ordinals instead of a constant integer to prevent "brittleness" of my code.
    // With that being said, as the old adage goes, "if it ain't broke, don't fix it"

    BLACK_CLUBS_ACE(1),
    BLACK_CLUBS_TWO(2),
    BLACK_CLUBS_THREE(3),
    BLACK_CLUBS_FOUR(4),
    BLACK_CLUBS_FIVE(5),
    BLACK_CLUBS_SIX(6),
    BLACK_CLUBS_SEVEN(7),
    BLACK_CLUBS_EIGHT(8),
    BLACK_CLUBS_NINE(9),
    BLACK_CLUBS_TEN(10),
    BLACK_CLUBS_JACK(11),
    BLACK_CLUBS_QUEEN(12),
    BLACK_CLUBS_KING(13),

    RED_DIAMONDS_ACE(14),
    RED_DIAMONDS_TWO(15),
    RED_DIAMONDS_THREE(16),
    RED_DIAMONDS_FOUR(17),
    RED_DIAMONDS_FIVE(18),
    RED_DIAMONDS_SIX(19),
    RED_DIAMONDS_SEVEN(20),
    RED_DIAMONDS_EIGHT(21),
    RED_DIAMONDS_NINE(22),
    RED_DIAMONDS_TEN(23),
    RED_DIAMONDS_JACK(24),
    RED_DIAMONDS_QUEEN(25),
    RED_DIAMONDS_KING(26),

    RED_HEARTS_ACE(27),
    RED_HEARTS_TWO(28),
    RED_HEARTS_THREE(29),
    RED_HEARTS_FOUR(30),
    RED_HEARTS_FIVE(31),
    RED_HEARTS_SIX(32),
    RED_HEARTS_SEVEN(33),
    RED_HEARTS_EIGHT(34),
    RED_HEARTS_NINE(35),
    RED_HEARTS_TEN(36),
    RED_HEARTS_JACK(37),
    RED_HEARTS_QUEEN(38),
    RED_HEARTS_KING(39),

    BLACK_SPADES_ACE(40),
    BLACK_SPADES_TWO(41),
    BLACK_SPADES_THREE(42),
    BLACK_SPADES_FOUR(43),
    BLACK_SPADES_FIVE(43),
    BLACK_SPADES_SIX(44),
    BLACK_SPADES_SEVEN(45),
    BLACK_SPADES_EIGHT(46),
    BLACK_SPADES_NINE(47),
    BLACK_SPADES_TEN(48),
    BLACK_SPADES_JACK(49),
    BLACK_SPADES_QUEEN(50),
    BLACK_SPADES_KING(51),

    RED_JOKER(52),
    BLACK_JOKER(53),
    ;

    private final int cardNumber;

    CARD_DECK(int cardNumber) {

        this.cardNumber = cardNumber;

    }


}
