# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 140, lane `ship`
- `stress`: `retry load`, score 185, lane `ship`
- `edge`: `worker slack`, score 224, lane `ship`
- `recovery`: `session drift`, score 208, lane `ship`
- `stale`: `queue pressure`, score 189, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
