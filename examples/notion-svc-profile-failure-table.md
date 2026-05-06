# Notion Svc Profile Pipe Failure Table

| Case | Focus | Expected Lane |
| --- | --- | --- |
| g001 | queue pressure | watch |
| g002 | retry load | ship |
| g003 | worker slack | hold |
| g004 | session drift | ship |
| g005 | queue pressure | watch |
| g006 | retry load | hold |
| g007 | worker slack | watch |
| g008 | session drift | hold |
| g009 | queue pressure | ship |
| g010 | retry load | ship |
| g011 | worker slack | ship |
| g012 | session drift | ship |

Use this table when a verifier failure is hard to read from the raw CSV.
