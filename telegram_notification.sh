

curl -s -X POST https://api.telegram.org/bot$TELEGRAM_TOKEN/sendMessage -d chat_id=$TELEGRAM_CHAT_ID -d text="result:$TRAVIS_TEST_RESULT | repository:${TRAVIS_REPO_SLUG} | branch:${TRAVIS_BRANCH} | job url:${TRAVIS_JOB_WEB_URL}" -d parse_mode="Markdown"