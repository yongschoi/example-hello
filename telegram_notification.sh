#!/bin/sh

# Define send message function. parse_mode can be changed to
# HTML, depending on how you want to format your message:
curl -s -X POST https://api.telegram.org/bot$TELEGRAM_TOKEN/sendMessage \
-d chat_id=$TELEGRAM_CHAT_ID \
-d text="
-------------------------------------
Travis build *${TRAVIS_TEST_RESULT}*
\`Repository: ${TRAVIS_REPO_SLUG}\`
\`Branch: ${TRAVIS_BRANCH}\`
*Commit Msg:*
${TRAVIS_COMMIT_MESSAGE}
[Job Log here](${TRAVIS_JOB_WEB_URL})
--------------------------------------" \
-d parse_mode="Markdown"
