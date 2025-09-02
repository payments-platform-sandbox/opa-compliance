# OPA Compliance (`opa-compliance`)

> Policy-as-code service using **Open Policy Agent (OPA)** for enforcing transaction rules and compliance checks.  


## 1) Overview
This service enforces **business and compliance policies** on payments.  
Policies are written in Rego, versioned, and validated in CI.  
OPA evaluates requests before workflows proceed.  

**Responsibilities**
- Provide **policy decisions** (allow/deny) to orchestration & payment services  
- Store and version policy bundles  
- Log policy decisions for audit  


## 2) Functional Requirements
- **FR1 (Workflow Execution):** Checks policies before workflow execution  
- **FR4 (Refunds & Cancellations):** Enforces refund/cancel rules (limits, eligibility)  


## 3) Policy Examples
- Transaction amount limits  
- Currency allowlist  
- Refund eligibility rules  
- Cancellation windows  


## 4) Tech Stack
- Open Policy Agent (OPA)  
- Java 17 + Spring Boot adapter  
- Git-based policy bundles  


## 5) License
MIT
