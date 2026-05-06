fun main() {
    val signalcase_1 = Signal(84, 82, 12, 13, 5)
    check(Policy.score(signalcase_1) == 144)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(98, 88, 21, 16, 7)
    check(Policy.score(signalcase_2) == 132)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(85, 89, 27, 13, 5)
    check(Policy.score(signalcase_3) == 93)
    check(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(67, 42, 27, 45)
    check(DomainReviewLens.score(domainReview) == 140)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
