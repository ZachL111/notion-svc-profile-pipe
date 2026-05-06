# Field Notes

The useful part of this repository is the small rule set around queue pressure and worker slack.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

The widest spread is between `worker slack` and `queue pressure`, so those are the first two cases I would preserve during a refactor.

The local verifier covers this data so the notes stay tied to code.
