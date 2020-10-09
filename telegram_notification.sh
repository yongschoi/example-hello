#!/bin/sh

if [ $TRAVIS_TEST_RESULT -eq 0 ]; then
    build_status="failed"
else
    build_status="succeeded"
fi

curl -s -X POST https://api.telegram.org/bot$TELEGRAM_TOKEN/sendMessage -d chat_id=$TELEGRAM_CHAT_ID -d text="Travis build : ${build_status}" -d parse_mode="Markdown"