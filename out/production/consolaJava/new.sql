SELECT
  coalesce(count(1), 0)                        cant,
  coalesce(count(DISTINCT (CASE WHEN cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_count_custs,
  coalesce(count(DISTINCT (cc_owner_name)), 0) phcpf_count_owner,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND pmwdmth_id <> :op_pmwdmth_id
    THEN pmwdmth_id
                           ELSE NULL END)), 0) phcpf_count_cc_type_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND pmwdmth_id <> :op_pmwdmth_id
    THEN pmwdmth_id
                           ELSE NULL END)), 0) phcpf_count_cc_type_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND pmwdmth_id <> :op_pmwdmth_id
    THEN pmwdmth_id
                           ELSE NULL END)), 0) phcpf_count_cc_type_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 30 AND pmwdmth_id <> :op_pmwdmth_id
    THEN pmwdmth_id
                           ELSE NULL END)), 0) phcpf_count_cc_type_30d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND pmwdmth_id <> :op_pmwdmth_id
    THEN pmwdmth_id
                           ELSE NULL END)), 0) phcpf_count_cc_type_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 0.04167 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_1h,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 0.25 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_6h,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 0.5 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_12h,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 30 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_30d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_count_cc_90d,
  coalesce(avg(CASE WHEN date_diff <= 1 AND in_mediation_or_approved
    THEN dol_amount
               ELSE NULL END), 0)              phcpf_avg_amount_1d,
  coalesce(avg(CASE WHEN date_diff <= 7 AND in_mediation_or_approved
    THEN dol_amount
               ELSE NULL END), 0)              phcpf_avg_amount_7d,
  coalesce(avg(CASE WHEN date_diff <= 30 AND in_mediation_or_approved
    THEN dol_amount
               ELSE NULL END), 0)              phcpf_avg_amount_30d,
  coalesce(avg(CASE WHEN date_diff <= 90 AND in_mediation_or_approved
    THEN dol_amount
               ELSE NULL END), 0)              phcpf_avg_amount_90d,
  coalesce(sum(CASE WHEN (date_diff >= 70 AND date_diff <= 90) AND approved_and_accredited AND
                         cc_hash_number = :cc_hash_number
    THEN 1
               ELSE 0 END), 0)                 phcpf_qty_older_70d,
  coalesce(sum(CASE WHEN (date_diff >= 70 AND date_diff <= 90) AND approved_and_accredited AND
                         cc_hash_number = :cc_hash_number
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amount_qty_older_70d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND approved_and_accredited AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_app_acc_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND approved_and_accredited AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_app_acc_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND approved_and_accredited AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_app_acc_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND approved_and_accredited AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_app_acc_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND (pending_bad_filled OR rejected_bad_filled) AND
                                     cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_bf_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND (pending_bad_filled OR rejected_bad_filled) AND
                                     cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_bf_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND (pending_bad_filled OR rejected_bad_filled) AND
                                     cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_bf_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND (pending_bad_filled OR rejected_bad_filled) AND
                                     cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_bf_60d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 1 AND rejected_call_for_authorize AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_rcfa_1d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 7 AND rejected_call_for_authorize AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_rcfa_7d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 15 AND rejected_call_for_authorize AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_rcfa_15d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 60 AND rejected_call_for_authorize AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_rcfa_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND rejected_high_risk AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_rhr_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND rejected_high_risk AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_rhr_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND rejected_high_risk AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_rhr_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND rejected_high_risk AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_rhr_60d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 1 AND rejected_insufficient_amount AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_ria_1d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 7 AND rejected_insufficient_amount AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_ria_7d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 15 AND rejected_insufficient_amount AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_ria_15d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 60 AND rejected_insufficient_amount AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_ria_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND rejected_other_reason AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ro_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND rejected_other_reason AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ro_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND rejected_other_reason AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ro_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND rejected_other_reason AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ro_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND cancelled AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_c_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND cancelled AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_c_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND cancelled AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_c_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND cancelled AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_c_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND in_mediation_pending AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_imp_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND in_mediation_pending AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_imp_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND in_mediation_pending AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_imp_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND in_mediation_pending AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_imp_60d,
  coalesce(count(DISTINCT
                 (CASE WHEN date_diff <= 1 AND in_process_pending_review_manual AND cc_hash_number <> :cc_hash_number
                   THEN cc_hash_number
                  ELSE NULL END)), 0)          phcpf_tcs_ip_prm_1d,
  coalesce(count(DISTINCT
                 (CASE WHEN date_diff <= 7 AND in_process_pending_review_manual AND cc_hash_number <> :cc_hash_number
                   THEN cc_hash_number
                  ELSE NULL END)), 0)          phcpf_tcs_ip_prm_7d,
  coalesce(count(DISTINCT
                 (CASE WHEN date_diff <= 15 AND in_process_pending_review_manual AND cc_hash_number <> :cc_hash_number
                   THEN cc_hash_number
                  ELSE NULL END)), 0)          phcpf_tcs_ip_prm_15d,
  coalesce(count(DISTINCT
                 (CASE WHEN date_diff <= 60 AND in_process_pending_review_manual AND cc_hash_number <> :cc_hash_number
                   THEN cc_hash_number
                  ELSE NULL END)), 0)          phcpf_tcs_ip_prm_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND in_process_other AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ip_o_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND in_process_other AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ip_o_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND in_process_other AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ip_o_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND in_process_other AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ip_o_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND refunded AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ref_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND refunded AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ref_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND refunded AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ref_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND refunded AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ref_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND charged_back AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_cbk_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND charged_back AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_cbk_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 15 AND charged_back AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_cbk_15d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND charged_back AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_cbk_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND approved_and_accredited AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_app_acc_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND approved_and_accredited AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_app_acc_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_bf_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_bf_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_call_for_authorize AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_rcfa_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_call_for_authorize AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_rcfa_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_high_risk AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_rhr_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_high_risk AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_rhr_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_insufficient_amount AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ria_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_insufficient_amount AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ria_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_other_reason AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ro_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_other_reason AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ro_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND cancelled AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_c_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND cancelled AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_c_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_mediation_pending AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_imp_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_mediation_pending AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_imp_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_process_pending_review_manual AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ip_prm_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_process_pending_review_manual AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ip_prm_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_process_other AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ip_o_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_process_other AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ip_o_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND refunded AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ref_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND refunded AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_ref_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND charged_back AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_cbk_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND charged_back AND dol_amount >= 50
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_50_cbk_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND approved_and_accredited AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_app_acc_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND approved_and_accredited AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_app_acc_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_bf_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_bf_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_call_for_authorize AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_rcfa_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_call_for_authorize AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_rcfa_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_high_risk AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_rhr_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_high_risk AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_rhr_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_insufficient_amount AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ria_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_insufficient_amount AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ria_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_other_reason AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ro_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_other_reason AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ro_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND cancelled AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_c_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND cancelled AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_c_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_mediation_pending AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_imp_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND in_mediation_pending AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_imp_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_process_pending_review_manual AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ip_prm_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND in_process_pending_review_manual AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ip_prm_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_process_other AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ip_o_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND in_process_other AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ip_o_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND refunded AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ref_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND refunded AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ref_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND charged_back AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_cbk_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND charged_back AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_cbk_30d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND approved_and_accredited AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_app_acc_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND approved_and_accredited AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_app_acc_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_bf_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_bf_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_call_for_authorize AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_rcfa_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_call_for_authorize AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_rcfa_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_high_risk AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_rhr_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_high_risk AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_rhr_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_insufficient_amount AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ria_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_insufficient_amount AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ria_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_other_reason AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ro_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_other_reason AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ro_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND cancelled AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_c_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND cancelled AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_c_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_mediation_pending AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_imp_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_mediation_pending AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_imp_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_process_pending_review_manual AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ip_prm_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_process_pending_review_manual AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ip_prm_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_process_other AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ip_o_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_process_other AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ip_o_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND refunded AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ref_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND refunded AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_ref_7d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND charged_back AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_cbk_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND charged_back AND dol_amount >= 300
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_300_cbk_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND approved_and_accredited AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_app_acc_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND approved_and_accredited AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_app_acc_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_bf_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_bf_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_call_for_authorize AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_rcfa_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_call_for_authorize AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_rcfa_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_high_risk AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_rhr_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_high_risk AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_rhr_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_insufficient_amount AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ria_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_insufficient_amount AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ria_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_other_reason AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ro_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND rejected_other_reason AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ro_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND cancelled AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_c_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND cancelled AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_c_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_mediation_pending AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_imp_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND in_mediation_pending AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_imp_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_process_pending_review_manual AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ip_prm_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND in_process_pending_review_manual AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ip_prm_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_process_other AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ip_o_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND in_process_other AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ip_o_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND refunded AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ref_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND refunded AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ref_30d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND charged_back AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_cbk_15d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND charged_back AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_cbk_30d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND approved_and_accredited
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_app_acc_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND approved_and_accredited
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_app_acc_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND approved_and_accredited
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_app_acc_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND approved_and_accredited
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_app_acc_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND (pending_bad_filled OR rejected_bad_filled)
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_bf_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND (pending_bad_filled OR rejected_bad_filled)
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_bf_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND (pending_bad_filled OR rejected_bad_filled)
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_bf_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND (pending_bad_filled OR rejected_bad_filled)
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_bf_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_call_for_authorize
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rcfa_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_call_for_authorize
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rcfa_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_call_for_authorize
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rcfa_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND rejected_call_for_authorize
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rcfa_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_high_risk
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rhr_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_high_risk
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rhr_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_high_risk
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rhr_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND rejected_high_risk
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rhr_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_insufficient_amount
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ria_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_insufficient_amount
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ria_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_insufficient_amount
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ria_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND rejected_insufficient_amount
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ria_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND rejected_other_reason
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ro_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND rejected_other_reason
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ro_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND rejected_other_reason
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ro_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND rejected_other_reason
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ro_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND cancelled
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_c_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND cancelled
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_c_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND cancelled
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_c_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND cancelled
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_c_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_mediation_pending
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_imp_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_mediation_pending
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_imp_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_mediation_pending
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_imp_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND in_mediation_pending
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_imp_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_process_pending_review_manual
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_prm_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_process_pending_review_manual
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_prm_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_process_pending_review_manual
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_prm_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND in_process_pending_review_manual
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_prm_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND in_process_other
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_o_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND in_process_other
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_o_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND in_process_other
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_o_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND in_process_other
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_o_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND refunded
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ref_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND refunded
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ref_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND refunded
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ref_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND refunded
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ref_60d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND charged_back
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_cbk_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND charged_back
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_cbk_7d,
  coalesce(sum(CASE WHEN date_diff <= 15 AND charged_back
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_cbk_15d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND charged_back
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_cbk_60d,
  coalesce(sum(CASE WHEN (date_diff >= 30 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_30d,
  coalesce(sum(CASE WHEN (date_diff >= 45 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_45d,
  coalesce(sum(CASE WHEN (date_diff >= 50 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_50d,
  coalesce(sum(CASE WHEN (date_diff >= 55 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_55d,
  coalesce(sum(CASE WHEN (date_diff >= 60 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_60d,
  coalesce(sum(CASE WHEN (date_diff >= 65 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_65d,
  coalesce(sum(CASE WHEN (date_diff >= 70 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_70d,
  coalesce(sum(CASE WHEN (date_diff >= 80 AND date_diff <= 90) AND in_mediation_or_approved OR only_refunded
    THEN 1
               ELSE 0 END), 0)                 pays_approb_doc_number_80d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND cust_id = :receiver_id
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_self_financing_amt_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND cust_id = :receiver_id
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_self_financing_amt_7d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND cust_id = :receiver_id
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_self_financing_amt_30d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND cust_id = :receiver_id
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_self_financing_amt_90d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND cust_id = :receiver_id
    THEN 1
               ELSE 0 END), 0)                 phcpf_self_financing_qty_1d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND cust_id = :receiver_id
    THEN 1
               ELSE 0 END), 0)                 phcpf_self_financing_qty_7d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND cust_id = :receiver_id
    THEN 1
               ELSE 0 END), 0)                 phcpf_self_financing_qty_30d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND cust_id = :receiver_id
    THEN 1
               ELSE 0 END), 0)                 phcpf_self_financing_qty_90d,
  coalesce(sum(CASE WHEN date_diff <= 1 AND ain
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ain_1d,
  coalesce(sum(CASE WHEN date_diff <= 3 AND ain
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ain_3d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND ain
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ain_7d,
  coalesce(sum(CASE WHEN date_diff <= 30 AND ain
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ain_30d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 1 AND ain AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_dist_user_ain_1d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 3 AND ain AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_dist_user_ain_3d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 7 AND ain AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_dist_user_ain_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 30 AND ain AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_dist_user_ain_30d,
  coalesce(count(CASE WHEN date_diff <= 7 AND receiver_id = :receiver_id AND status = 'approved'
    THEN 1
                 ELSE 0 END), 0)               phcpf_qr_app_qty_7d,
  coalesce(sum(CASE WHEN date_diff <= 7 AND receiver_id = :receiver_id AND status = 'approved'
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_qr_app_amt_7d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 20 AND receiver_id = :receiver_id AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_qr_dist_user_20d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND approved_and_accredited AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_app_acc_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND (pending_bad_filled OR rejected_bad_filled) AND
                                     cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_bf_90d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 90 AND rejected_call_for_authorize AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_rcfa_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND rejected_high_risk AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_rhr_90d,
  coalesce(
      count(DISTINCT (CASE WHEN date_diff <= 90 AND rejected_insufficient_amount AND cc_hash_number <> :cc_hash_number
        THEN cc_hash_number
                      ELSE NULL END)), 0)      phcpf_tcs_ria_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND rejected_other_reason AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ro_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND cancelled AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_c_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND in_mediation_pending AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_imp_90d,
  coalesce(count(DISTINCT
                 (CASE WHEN date_diff <= 90 AND in_process_pending_review_manual AND cc_hash_number <> :cc_hash_number
                   THEN cc_hash_number
                  ELSE NULL END)), 0)          phcpf_tcs_ip_prm_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND in_process_other AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ip_o_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND refunded AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_ref_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND charged_back AND cc_hash_number <> :cc_hash_number
    THEN cc_hash_number
                           ELSE NULL END)), 0) phcpf_tcs_cbk_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND approved_and_accredited AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_app_acc_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_bf_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_call_for_authorize AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_rcfa_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_high_risk AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_rhr_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_insufficient_amount AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ria_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_other_reason AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ro_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND cancelled AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_c_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_mediation_pending AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_imp_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_process_pending_review_manual AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ip_prm_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_process_other AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ip_o_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND refunded AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_ref_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND charged_back AND dol_amount >= 150
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_150_cbk_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND approved_and_accredited AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_app_acc_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND (pending_bad_filled OR rejected_bad_filled) AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_bf_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_call_for_authorize AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_rcfa_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_high_risk AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_rhr_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_insufficient_amount AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ria_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_other_reason AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ro_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND cancelled AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_c_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_mediation_pending AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_imp_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_process_pending_review_manual AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ip_prm_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_process_other AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ip_o_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND refunded AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_ref_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND charged_back AND dol_amount >= 750
    THEN 1
               ELSE 0 END), 0)                 phcpf_amt_750_cbk_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND approved_and_accredited
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_app_acc_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND (pending_bad_filled OR rejected_bad_filled)
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_bf_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_high_risk
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_rhr_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_insufficient_amount
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ria_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND rejected_other_reason
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ro_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND cancelled
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_c_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_mediation_pending
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_imp_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_process_pending_review_manual
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_prm_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND in_process_other
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ip_o_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND refunded
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ref_90d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND charged_back
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_cbk_90d,
  coalesce(sum(CASE WHEN date_diff <= 60 AND ain
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ain_60d,
  coalesce(sum(CASE WHEN date_diff <= 90 AND ain
    THEN dol_amount
               ELSE 0 END), 0)                 phcpf_amt_ain_90d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 60 AND ain AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_dist_user_ain_60d,
  coalesce(count(DISTINCT (CASE WHEN date_diff <= 90 AND ain AND cust_id <> :cust_id
    THEN cust_id
                           ELSE NULL END)), 0) phcpf_dist_user_ain_90d
FROM (SELECT *
      FROM ((SELECT
               site_id,
               doc_number,
               status,
               receiver_id,
               pmwdmth_id,
               cust_id,
               dol_amount,
               cc_hash_number,
               replace(lower(cc_owner_name), '[^A-Za-z0-9]', '')                                                                                                                                                                                                       AS cc_owner_name,
               status = 'approved' AND status_detail =
                                       'accredited'                                                                                                                                                                                                                    AS approved_and_accredited,
               status = 'approved' OR status =
                                      'in_mediation'                                                                                                                                                                                                                   AS in_mediation_or_approved,
               status = 'pending' AND status_detail IN
                                      ('pending_form_bad_filled_card_number', 'pending_form_bad_filled_other', 'pending_form_bad_filled_date', 'pending_form_bad_filled_security_code')                                                                                AS pending_bad_filled,
               status = 'rejected' AND status_detail IN
                                       ('cc_rejected_bad_filled_card_number', 'cc_rejected_bad_filled_date', 'cc_rejected_bad_filled_other', 'cc_rejected_bad_filled_security_code')                                                                                   AS rejected_bad_filled,
               status = 'rejected' AND status_detail =
                                       'cc_rejected_call_for_authorize'                                                                                                                                                                                                AS rejected_call_for_authorize,
               status = 'rejected' AND status_detail =
                                       'cc_rejected_high_risk'                                                                                                                                                                                                         AS rejected_high_risk,
               status = 'rejected' AND status_detail =
                                       'cc_rejected_insufficient_amount'                                                                                                                                                                                               AS rejected_insufficient_amount,
               status = 'rejected' AND status_detail IN
                                       ('cc_rejected_blacklist', 'cc_rejected_fraud', 'rejected', 'collector_unavailable', 'payer_unavailable', 'cc_rejected_invalid_installments', 'cc_rejected_card_disabled', 'cc_rejected_card_error', 'cc_rejected_other_reason') AS rejected_other_reason,
               status = 'charged_back' AND status_detail IN
                                           ('reimbursed', 'charged_back', 'in_process', 'settled')                                                                                                                                                                     AS charged_back,
               status = 'cancelled' AND status_detail IN
                                        ('expired', 'by_payer', 'by_collector')                                                                                                                                                                                        AS cancelled,
               status = 'in_mediation' AND status_detail =
                                           'pending'                                                                                                                                                                                                                   AS in_mediation_pending,
               status = 'in_process' AND status_detail =
                                         'pending_review_manual'                                                                                                                                                                                                       AS in_process_pending_review_manual,
               (status = 'in_process' AND status_detail = 'pending_contingency') OR (status = 'pending' AND
                                                                                     status_detail IN
                                                                                     ('pending', 'pending_additional_info', 'pending_waiting_for_remedy'))                                                                                                             AS in_process_other,
               status = 'refunded' AND status_detail IN
                                       ('by_admin', 'bpp_covered', 'bpp_refunded', 'refunded')                                                                                                                                                                         AS refunded,
               status =
               'refunded'                                                                                                                                                                                                                                              AS only_refunded,
               status IN ('approved', 'in_process') OR status_detail IN
                                                       ('pending', 'pending_card_validation', 'pending_waiting_for_remedy', 'pending_online_validation', 'pending_additional_info')                                                                                    AS ain,
               (unix_timestamp() - unix_timestamp(creation_date)) /
               86400                                                                                                                                                                                                                                                   AS date_diff
             FROM fscoring.payment_data_aux AS pd
                  USE INDEX (fscoring_idx_pd_doc_site_ptype_date)
             WHERE site_id = SUBSTRING_INDEX(:id, '-', 1) AND doc_number = SUBSTRING_INDEX(:id, '-', -1) AND
                   creation_date > (CURRENT_DATE() - INTERVAL 90 DAY) AND payment_type = 'credit_card'
             ORDER BY creation_date DESC
             LIMIT 100)
            UNION (SELECT
                     site_id,
                     doc_number,
                     status,
                     receiver_id,
                     pmwdmth_id,
                     cust_id,
                     dol_amount,
                     cc_hash_number,
                     replace(lower(cc_owner_name), '[^A-Za-z0-9]', '')                                                                                                                                                                                                       AS cc_owner_name,
                     status = 'approved' AND status_detail =
                                             'accredited'                                                                                                                                                                                                                    AS approved_and_accredited,
                     status = 'approved' OR status =
                                            'in_mediation'                                                                                                                                                                                                                   AS in_mediation_or_approved,
                     status = 'pending' AND status_detail IN
                                            ('pending_form_bad_filled_card_number', 'pending_form_bad_filled_other', 'pending_form_bad_filled_date', 'pending_form_bad_filled_security_code')                                                                                AS pending_bad_filled,
                     status = 'rejected' AND status_detail IN
                                             ('cc_rejected_bad_filled_card_number', 'cc_rejected_bad_filled_date', 'cc_rejected_bad_filled_other', 'cc_rejected_bad_filled_security_code')                                                                                   AS rejected_bad_filled,
                     status = 'rejected' AND status_detail =
                                             'cc_rejected_call_for_authorize'                                                                                                                                                                                                AS rejected_call_for_authorize,
                     status = 'rejected' AND status_detail =
                                             'cc_rejected_high_risk'                                                                                                                                                                                                         AS rejected_high_risk,
                     status = 'rejected' AND status_detail =
                                             'cc_rejected_insufficient_amount'                                                                                                                                                                                               AS rejected_insufficient_amount,
                     status = 'rejected' AND status_detail IN
                                             ('cc_rejected_blacklist', 'cc_rejected_fraud', 'rejected', 'collector_unavailable', 'payer_unavailable', 'cc_rejected_invalid_installments', 'cc_rejected_card_disabled', 'cc_rejected_card_error', 'cc_rejected_other_reason') AS rejected_other_reason,
                     status = 'charged_back' AND status_detail IN
                                                 ('reimbursed', 'charged_back', 'in_process', 'settled')                                                                                                                                                                     AS charged_back,
                     status = 'cancelled' AND status_detail IN
                                              ('expired', 'by_payer', 'by_collector')                                                                                                                                                                                        AS cancelled,
                     status = 'in_mediation' AND status_detail =
                                                 'pending'                                                                                                                                                                                                                   AS in_mediation_pending,
                     status = 'in_process' AND status_detail =
                                               'pending_review_manual'                                                                                                                                                                                                       AS in_process_pending_review_manual,
                     (status = 'in_process' AND status_detail = 'pending_contingency') OR (status = 'pending' AND
                                                                                           status_detail IN
                                                                                           ('pending', 'pending_additional_info', 'pending_waiting_for_remedy'))                                                                                                             AS in_process_other,
                     status = 'refunded' AND status_detail IN
                                             ('by_admin', 'bpp_covered', 'bpp_refunded', 'refunded')                                                                                                                                                                         AS refunded,
                     status =
                     'refunded'                                                                                                                                                                                                                                              AS only_refunded,
                     status IN ('approved', 'in_process') OR status_detail IN
                                                             ('pending', 'pending_card_validation', 'pending_waiting_for_remedy', 'pending_online_validation', 'pending_additional_info')                                                                                    AS ain,
                     (unix_timestamp() - unix_timestamp(creation_date)) /
                     86400                                                                                                                                                                                                                                                   AS date_diff
                   FROM fscoring.payment_data_aux AS pd
                        USE INDEX (fscoring_idx_pd_doc_site_ptype_date)
                   WHERE site_id = SUBSTRING_INDEX(:id, '-', 1) AND doc_number = SUBSTRING_INDEX(:id, '-', -1) AND
                         creation_date > (CURRENT_DATE() - INTERVAL 90 DAY) AND payment_type = 'debit_card'
                   ORDER BY creation_date DESC
                   LIMIT 100)
            UNION (SELECT
                     site_id,
                     doc_number,
                     status,
                     receiver_id,
                     pmwdmth_id,
                     cust_id,
                     dol_amount,
                     cc_hash_number,
                     replace(lower(cc_owner_name), '[^A-Za-z0-9]', '')                                                                                                                                                                                                       AS cc_owner_name,
                     status = 'approved' AND status_detail =
                                             'accredited'                                                                                                                                                                                                                    AS approved_and_accredited,
                     status = 'approved' OR status =
                                            'in_mediation'                                                                                                                                                                                                                   AS in_mediation_or_approved,
                     status = 'pending' AND status_detail IN
                                            ('pending_form_bad_filled_card_number', 'pending_form_bad_filled_other', 'pending_form_bad_filled_date', 'pending_form_bad_filled_security_code')                                                                                AS pending_bad_filled,
                     status = 'rejected' AND status_detail IN
                                             ('cc_rejected_bad_filled_card_number', 'cc_rejected_bad_filled_date', 'cc_rejected_bad_filled_other', 'cc_rejected_bad_filled_security_code')                                                                                   AS rejected_bad_filled,
                     status = 'rejected' AND status_detail =
                                             'cc_rejected_call_for_authorize'                                                                                                                                                                                                AS rejected_call_for_authorize,
                     status = 'rejected' AND status_detail =
                                             'cc_rejected_high_risk'                                                                                                                                                                                                         AS rejected_high_risk,
                     status = 'rejected' AND status_detail =
                                             'cc_rejected_insufficient_amount'                                                                                                                                                                                               AS rejected_insufficient_amount,
                     status = 'rejected' AND status_detail IN
                                             ('cc_rejected_blacklist', 'cc_rejected_fraud', 'rejected', 'collector_unavailable', 'payer_unavailable', 'cc_rejected_invalid_installments', 'cc_rejected_card_disabled', 'cc_rejected_card_error', 'cc_rejected_other_reason') AS rejected_other_reason,
                     status = 'charged_back' AND status_detail IN
                                                 ('reimbursed', 'charged_back', 'in_process', 'settled')                                                                                                                                                                     AS charged_back,
                     status = 'cancelled' AND status_detail IN
                                              ('expired', 'by_payer', 'by_collector')                                                                                                                                                                                        AS cancelled,
                     status = 'in_mediation' AND status_detail =
                                                 'pending'                                                                                                                                                                                                                   AS in_mediation_pending,
                     status = 'in_process' AND status_detail =
                                               'pending_review_manual'                                                                                                                                                                                                       AS in_process_pending_review_manual,
                     (status = 'in_process' AND status_detail = 'pending_contingency') OR (status = 'pending' AND
                                                                                           status_detail IN
                                                                                           ('pending', 'pending_additional_info', 'pending_waiting_for_remedy'))                                                                                                             AS in_process_other,
                     status = 'refunded' AND status_detail IN
                                             ('by_admin', 'bpp_covered', 'bpp_refunded', 'refunded')                                                                                                                                                                         AS refunded,
                     status =
                     'refunded'                                                                                                                                                                                                                                              AS only_refunded,
                     status IN ('approved', 'in_process') OR status_detail IN
                                                             ('pending', 'pending_card_validation', 'pending_waiting_for_remedy', 'pending_online_validation', 'pending_additional_info')                                                                                    AS ain,
                     (unix_timestamp() - unix_timestamp(creation_date)) /
                     86400                                                                                                                                                                                                                                                   AS date_diff
                   FROM fscoring.payment_data_aux AS pd
                        USE INDEX (fscoring_idx_pd_doc_site_ptype_date)
                   WHERE site_id = SUBSTRING_INDEX(:id, '-', 1) AND doc_number = SUBSTRING_INDEX(:id, '-', -1) AND
                         creation_date > (CURRENT_DATE() - INTERVAL 90 DAY) AND payment_type = 'prepaid_card'
                   ORDER BY creation_date DESC
                   LIMIT 100)
            ORDER BY date_diff ASC
            LIMIT 100) tmp) temp
LIMIT :limit;