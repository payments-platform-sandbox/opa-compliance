package com.pps.opa;

import com.pps.opa.dto.PolicyDecision;
import com.pps.opa.dto.PolicyInput;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/decision/payments")
public class PolicyController {

    @PostMapping("/allow")
    public ResponseEntity<PolicyDecision> evaluate(@Validated @RequestBody PolicyInput input) {
        // TODO: call OPA here (or load policies locally). For now, naive allow as a stub.
        PolicyDecision d = new PolicyDecision();
        d.decision = (input.amountCents != null && input.amountCents > 0) ? "allow" : "deny";
        d.reason = d.decision.equals("allow") ? "stubbed_allow" : "invalid_amount";
        return ResponseEntity.ok(d);
    }
}