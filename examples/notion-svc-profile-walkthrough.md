# Notion Svc Profile Pipe Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 140 | ship |
| stress | retry load | 185 | ship |
| edge | worker slack | 224 | ship |
| recovery | session drift | 208 | ship |
| stale | queue pressure | 189 | ship |

Start with `edge` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `worker slack` against `queue pressure`, not the raw score alone.
