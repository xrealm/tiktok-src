package com.bytedance.ies.abmock;

import com.aweme.storage.C1908a;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankAbModel;
import com.p280ss.android.ugc.aweme.experiment.C6913e;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.FeedCompoundConfig;
import com.p280ss.android.ugc.aweme.image.experiment.C7107a;
import com.p280ss.android.ugc.aweme.player.p334ab.C7189a;
import com.p280ss.android.ugc.aweme.player.p334ab.C7190b;
import com.p280ss.android.ugc.aweme.player.p334ab.abs.VolumeBalanceData;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.video.experiment.VideoCDNUrlTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloaderConfig;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.C7280a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

public class ABModel {
    public int D_enable_double_tap_to_like = 1;
    public int D_enable_follow_hint_guide = 1;
    public int D_enable_long_press_guide = 1;
    public int D_enable_music_detail_guide = 1;
    public int D_enable_transition_to_profile_guide = 1;
    public boolean FeedRecommendUserTestMode;
    public boolean ProfileGuideTestMode;
    public int account_service_type = 3;
    public int addicted_popup_style;
    public int all_video_show_vs;
    public double animation_duration_when_refresh_by_reusing_unreached_data = 0.4d;
    public boolean async_ws_open = true;
    public int awe_mix_cell_style = 1;
    public AwemeAdRankAbModel aweme_ad_rank;
    public boolean aweme_follow_show_forward;
    public int aweme_user_cover_video;
    public boolean aweme_will_stop_when_headphones_pulled;
    public boolean awesome_splash_event_send;
    public int awesome_splash_preload_optimize;
    public int back_refresh_strategy;
    public int bind_phone_for_post_comment = 21;
    public double bitrate_switch_threshold = 0.75d;
    public int bullet_screen_digg;
    public int bullet_screen_page;
    public int bullet_screen_strategy;
    public int bundle_dynamic_load;
    public int caption_enable_see_more_mt = 1;
    public boolean catch_crash_activity = true;
    public boolean category_show_branch_billboard_entrance;
    public long cdn_url_timeout_time = VideoCDNUrlTimeoutExperiment.DEFAULT_TIMEOUT;
    public boolean change_username_guide;
    public int channel_2_tab_mode;
    public boolean check_video_cache_request_header = true;
    public int checksum_level;
    public int clean_up_invalid_videos;
    public int close_client_watermark;
    public boolean code_coverage;
    public boolean comment_auto_add_layout;
    public int comment_keyboard_show_optimization;
    public boolean commerce_use_webview_ua_douyin;
    public int complete_profile_name_and_avatar_strategy;
    public FeedCompoundConfig[] compound_request_setting;
    public boolean correlated_videos_search;
    public int create_group_chat_guide_exploration;
    public boolean cronet_plugin_test;
    public int data_saver_mode;
    public boolean debug_test_anti_addiction;
    public int decoder_type;
    public boolean description_auto_translate;
    public int detail_animation_time;
    public int direct_show_comment_mention_list;
    public boolean disable_async_widgetbind = true;
    public int disable_hot_spot;
    public int discover_speed_detail;
    public int discover_v4_type;
    public boolean divide_aweme_v1_user = true;
    public boolean dmt_pause_video_when_commenting;
    public int double_column_search_history_style;
    public int double_tap_to_like_style;
    public int douplus_bring_to_front = 1;
    public int douplus_entry_feed;
    public boolean douplus_show_v3_enable;
    public boolean downloader_use_ttnet_ab;
    public int dynamic_cover_style;
    public int edit_profile_optimization_style;
    public boolean enable_ad_feedback_optimize = true;
    public boolean enable_alog = true;
    public int enable_api_libra;
    public boolean enable_block_detect;
    public boolean enable_cellinfo_report;
    public boolean enable_comment_video_shrink;
    public boolean enable_cover_poster_switch;
    public boolean enable_cronet_4x;
    public boolean enable_df_dummy;
    public int enable_dynamic_rate;
    public boolean enable_end_watermark_MT;
    public boolean enable_enhance_report;
    public int enable_expose_ttplayer_crash_signal;
    public boolean enable_fabric = true;
    public boolean enable_feed_duplicate_filter;
    public boolean enable_fetch_network_info = true;
    public int enable_follow_hint_guid = 1;
    public boolean enable_full_feed_follow_show_live = true;
    public boolean enable_full_screen_aweme_title_expand;
    public boolean enable_full_screen_read_adaption = true;
    public boolean enable_h265 = true;
    public boolean enable_h265_black_list;
    public int enable_history_sug_new_style;
    public boolean enable_hotsearch_aweme_billboard;
    public int enable_hybrid_data_prefetch;
    public boolean enable_init_fabric;
    public boolean enable_like_by_author;
    public boolean enable_link_ad_migration = true;
    public boolean enable_live_in_follow_feed_full_screen;
    public boolean enable_multi_player;
    public int enable_music_detail_guid = 1;
    public boolean enable_network_monitor;
    public boolean enable_network_notice;
    public boolean enable_new_push_settings;
    public int enable_new_style_dislike;
    public boolean enable_new_ttnet;
    public boolean enable_notification_category;
    public boolean enable_others_profile_setting_sheet_style = true;
    public int enable_player_alog;
    public int enable_player_log = 1;
    public int enable_preload_background = 1;
    public boolean enable_recommend_filter_follow;
    public boolean enable_reuse_unreached_data_for_feed_refresh;
    public boolean enable_scroll_optimize_main_screen_follow;
    public int enable_set_playinfo_to_p2p;
    public int enable_setting_disk_manager;
    public int enable_speed_monitor;
    public int enable_style4_follow_double_click;
    public boolean enable_tile_shortcut;
    public boolean enable_videocache_plugin = true;
    public EnginePreloaderConfig engine_preload_config;
    public int engine_preloader_concurrent_num = 1;
    public int engine_preloader_open_timeout = 10;
    public int engine_preloader_preload_strategy = 1;
    public int engine_preloader_queue_or_stack = 1;
    public int engine_preloader_rw_timeout = 10;
    public int familiar_feed_strategy;
    public int familiar_feed_text_adjustment;
    public boolean feed_ad_optimize;
    public int feed_load_cache_delay;
    public int feed_overtime_hours = 48;
    public int feed_preload_idx = 3;
    public int feed_recommend_user_time_interval = 3;
    public int feed_recommend_user_view_style;
    public int feed_search_live_new_icon_v1;
    public int feed_swipe_left;
    public int feedback_post_page_style;
    public int feeds_show_red_dot_type;
    public int first_feed_connect_timeout;
    public int first_feed_read_timeout;
    public int first_feed_write_timeout;
    public boolean follow_detail_full_screen;
    public int follow_feed_auto_refresh_after_restart_duration;
    public int follow_feed_filter_strategy = 2;
    public int follow_feed_layout_strategy = 1;
    public int follow_feed_type;
    public int follow_feed_video_cut_type = 1;
    public int follow_unread_style;
    public boolean following_red_dot_reverse;
    public boolean for_you_feed_hide_verification_badge;
    public boolean for_you_new_translations;
    public int force_software_play = 1;
    public boolean force_video_url_use_https;
    public int fps_jank_interval;
    public boolean fps_jank_open = true;
    public int fps_monitor_duration;
    public int full_recommend_live_display_type;
    public int full_screen_live_display_type = 1;
    public int full_screen_unfollow;
    public int gather_mode;
    public int general_related_search_style;
    public boolean general_search_extra_info_clickable;
    public boolean general_search_has_video_tag;
    public boolean general_search_is_staggered;
    public int goods_seeding_page;
    public boolean h265_play_addr_policy_unify = true;
    public int hashtag_search_multi_info_style;
    public int hide_comment_header_widget;
    public int high_level_city_street_card_type;
    public int home_shot_icon;
    public int hot_info_label;
    public int hot_search_tip_view_style;
    public int hot_spot_list_style;
    public int i18n_message_page_style = 2;
    public int i18n_new_follow_feed_style = 1;
    public int im_feed_share_icon_type;
    public int im_reduction_strategy;
    public int im_share_auto_display_keyboard_and_emoji;
    public int im_share_header_order_strategy;
    public int im_share_header_show_strategy;
    public int im_share_video_message_style;
    public C7107a image_crop_config_v3;
    public int image_fetcher = 1;
    public int interction_button_style;
    public int interction_share_button_style;
    public int interction_share_button_whatsapp_style;
    public boolean is_async_search = true;
    public boolean is_async_setting = true;
    public boolean is_break_resume_check_enabled = true;
    public int is_deep_clean_enabled;
    public int is_feed_auto_rotate_video;
    public boolean is_feed_immediate;
    public boolean is_feed_load_cache = true;
    public boolean is_feed_load_cache_v2;
    public int is_feed_load_cache_v2_count;
    public int is_feed_load_cache_v2_time;
    public int is_feed_load_cache_v3;
    public int is_feed_load_cache_v3_count = 2;
    public int is_feed_load_cache_v3_time;
    public boolean is_force_request_validation;
    public boolean is_local_video_play_enable = true;
    public boolean is_play_link_select_enabled = true;
    public boolean is_preload_local_cache_path_video_play_enable;
    public boolean is_preload_process_data;
    public boolean is_record_last_network_speed_enabled = true;
    public boolean is_release_window_background;
    public int is_select_distance;
    public int is_smart_feed;
    public boolean is_ttplayer_async_init = true;
    public boolean is_upload_oom_hprof_file = true;
    public boolean is_video_cache_auto_adust_preload_max = true;
    public int jump_to_follow_tab;
    public int landing_follow_tab_category;
    public int link_selector_type;
    public int live_enable_share_back_style_new = 1;
    public boolean live_hide_right_views;
    public int live_square_entrance_style;
    public int long_press_category;
    public int m_dislike_with_reason;
    public int m_post_push_group = 1;
    public int main_tab_strip_style;
    public int main_tab_style = 1;
    public int main_tab_top_text_distance;
    public int merchandise_search_style;
    public int message_background_style_in_chat;
    public int micro_app_item_type;
    public int mix_search_arrangement;
    public int motion_max_minute = 10;
    public MLModel[] mscene;
    public int mt_login_revision_android;
    public int mt_main_tab_swipe_switch;
    public int mt_merge_profile_v2;
    public boolean mt_nested_comments_hide;
    public int mt_rn_use_bullet;
    public boolean mt_tutorial_video;
    public int music_card_style;
    public boolean music_detail_music_partners_new_style;
    public int music_show_like_num;
    public boolean mute_v1_log;
    public boolean mv_theme_mode_switch = true;
    public long network_notice_time = C40413c.f105051b;
    public boolean new_download_ux;
    public int new_follow_feed_comment;
    public boolean new_follow_feed_path;
    public int new_follow_feed_style = 1;
    public boolean nickname_to_username_on_video_player;
    public int non_standard_ad_publish_toast_style;
    public int normal_splash_download_optimize;
    public int notice_count_net_ab;
    public int notice_jedi_ab;
    public int optimize_hot_point_panel;
    public boolean optimize_top_ui_full_screen_follow;
    public int other_page_recommend_users;
    public int personal_add_friends_style;
    public boolean play_twice_share_show_friends;
    public int player_ab_backup_dns_type = 3;
    public int player_ab_block_type;
    public int player_ab_main_dns_timeout;
    public int player_ab_main_dns_type;
    public int player_buffer_data_time = 1000;
    public int player_cache_use_private_path = 1;
    public int player_codec_sync_mode;
    public int player_dash_audio_range = 409600;
    public int player_dash_enable_hijack;
    public int player_dash_hijack_backup_dns;
    public int player_dash_hijack_main_dns = 2;
    public int player_dash_range = 1;
    public int player_dash_video_range = 1048576;
    public int player_data_encrpt = 1;
    public int player_disable_timeout = 1;
    public int player_enable_reuse_mtk_hw_workaround;
    public int player_enable_seek_interrupt;
    public int player_enable_volume_balance;
    public boolean player_event_log_open;
    public int player_framews_wait = 1;
    public int player_max_buffer_time = 5000;
    public int player_medialoader_enable_benchmark_io;
    public int player_medialoader_enable_speed_coefficient;
    public int player_option_cache = 15;
    public int player_play_use_2_cdn_url;
    public int player_precreateplayer;
    public boolean player_preload_lazy_get_urls = true;
    public boolean player_refactor;
    public int player_reuse_engine;
    public int player_skip_find_stream_info = 1;
    public int player_test_speed_version = 2;
    public int player_type;
    public C7189a player_type_v2;
    public C7190b player_unified_ab_config;
    public int player_use_codecpool;
    public int player_use_http2;
    public boolean player_use_last_url_if_403 = true;
    public boolean player_use_video_texture_renderer;
    public VolumeBalanceData player_volume_balance_data;
    public int poi_city_tag_optimize;
    public int poi_enable_video_rank;
    public int poi_nearby_accelarated;
    public int poi_nearby_fullscreen_showlive;
    public int poi_question_answering_position;
    public boolean poi_share_as_token;
    public int poi_show_double_column_video;
    public boolean post_push_landing_following;
    public int praise_dialog_experiment;
    public int preferred_show_goods_tab = 1;
    public int preload_gather_expire = 60;
    public int preload_gather_mode;
    public boolean preload_media_codec;
    public PreloadStrategyConfig preload_strategy;
    public int preload_vesdk_task;
    public int preloader_type;
    public boolean profile_recommend_user_when_empty;
    public int profile_video_cover_strategy;
    public int publish_video_strategy_type;
    public int push_guide_type;
    public int real_time_report_max_nums = 10;
    public int real_time_report_of_new_user;
    public int rec_user_expansion;
    public boolean refresh_music_search_view_holder;
    public int refresh_style;
    public boolean relation_label_click_enter;
    public boolean remove_15s_cap_music = true;
    public int remove_friend_tab;
    public boolean rn_perf_monitor;
    public boolean rn_search_transfer_preload_data = true;
    public boolean rn_use_librarian;
    public boolean satan_jank_open = true;
    public int search_carousel;
    public int search_entrance_right;
    public int search_in_detail_mode;
    public int search_intermediate_style;
    public int search_middle_component_style = 3;
    public int search_mix_display_type;
    public int search_mix_filter_aladdin;
    public int search_mix_multi_mod;
    public int search_mix_order_disable_synthesis;
    public int search_recom_word_row_count;
    public int search_recom_word_show_delay = 5;
    public boolean search_result_has_video_tab = true;
    public boolean search_sug_completion;
    public int search_transfer_is_not_destroy;
    public int search_transfer_is_prerender;
    public int search_user_style = 2;
    public int second_tab_display_type = 8;
    public int second_tab_last_status;
    public int send_message_style_in_user_profile;
    public int share_button_style;
    public int share_guide;
    public int share_guide_daily_limit;
    public int share_guide_threshold;
    public int share_icon_inverse_strategy;
    public int share_icon_variant;
    public boolean should_force_to_keep_surface_below_kitkat;
    public int show_complete_profile_alert_style;
    public int show_detail_search_entrance;
    public int show_duoshan_share;
    public boolean show_global_multi_func;
    public int show_nearby_hot_aweme;
    public int show_play_count;
    public int show_scroll_to_feed_follow_guide;
    public int show_share_text_for_new_user;
    public int show_sort_and_filter;
    public int show_super_accounts_to_unlogged_users;
    public boolean show_toast_first_encounter_feed_digg_from_friends;
    public PreloadStrategyConfig[] smart_preload_strategy;
    public C7280a smart_preload_strategy_v2;
    public int splash_udp_stop_app_id;
    public boolean start_replace_resources_get_drawable = true;
    public int sticker_owner_ab;
    public boolean stop_main_anim_when_invisible;
    public C1908a storage_clean;
    public C6913e storage_strategy_config_v2;
    public int street_info_type;
    public int suggestion_friends_entrance_type;
    public int super_res_265;
    public int super_res_bitrate;
    public int super_res_cpu_frequency;
    public int super_res_cpu_nums;
    public int super_res_ratio_level;
    public boolean support_share_comment;
    public boolean swipe_guide_style;
    public int t_dislike_style;
    public int tag_show_like_num;
    public int tiktok_discovery_page;
    public boolean tools_use_downloader;
    public int top_follow_notice_live_unread_style;
    public boolean try_fix_firebase_anr = true;
    public int ttplayer_hardware_media_render_type = 1;
    public int ttplayer_is_ipc;
    public int ttplayer_render_type;
    public int ttplayer_use_sys_audio_codec;
    public int unlogin_digg_limit;
    public boolean update_enigma_scanner;
    public boolean upload_avatar_switch_to_ttupload;
    public boolean use_download_in_music;
    public boolean use_pb_for_recommend_feed = true;
    public int use_profile_collection_tab;
    public int use_profile_collection_tab_new_syle;
    public int use_relieve_aweme;
    public int use_relieve_toast;
    public int use_ttnet;
    public boolean use_video_cache_http_dns;
    public int user_rate_strategy;
    public double video_auto_model_threshold = -1.0d;
    public int video_buffering_threshold;
    public int video_cache_read_buffersize = VideoCacheReadBuffersizeExperiment.DEFAULT;
    public boolean video_cache_write_asynchronous;
    public int video_cover_style;
    public int video_download_speed_cost_time;
    public int video_network_speed_algorithm;
    public int video_post_time_style;
    public int video_preload_number = 1;
    public int video_preload_size = VideoPreloadSizeExperiment.DEFAULT;
    public int video_search_show_style;
    public int video_sound_guide_old_user;
    public int video_speed_queue_size = 10;
    public int video_switch_https_threshold;
    public int videocache_loader_type;
    public int videocache_p2p_level;
    public int videocache_ttnet_preload_timeout = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
    public int videocache_ttnet_proxy_timeout = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
    public int vs_aweme_dcd_aladdin = 1;
    public String[] webview_cache_pool_switch;
    public String[] webview_cache_urls;
    public boolean webview_monitor_enable;
    public boolean webview_progress_bar;
    public boolean whatsapp_need_share_link;
    public int whatsapp_share_type;
    public int whatsapp_status_share_policy;
}