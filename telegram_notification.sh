
curl -s -X POST https://api.telegram.org/bot$TELEGRAM_TOKEN/sendMessage -d chat_id=$TELEGRAM_CHAT_ID -d text="Travis build : $TRAVIS_TEST_RESULT" -d parse_mode="Markdown"