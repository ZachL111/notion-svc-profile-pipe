# notion-svc-profile-pipe

`notion-svc-profile-pipe` keeps a focused Kotlin implementation around backend services. The project goal is to design a Kotlin verification harness for profile systems, covering visual model generation, layout fixtures, and failure-oriented tests.

## Project Rationale

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Notion Svc Profile Pipe Review Notes

`edge` and `baseline` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Feature Set

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/notion-svc-profile-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `worker slack` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Kotlin addition stays small enough to inspect in one sitting.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

The same command runs the local verification path. The highest-scoring domain case is `edge` at 224, which lands in `ship`. The most cautious case is `baseline` at 140, which lands in `ship`.

## Next Improvements

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
