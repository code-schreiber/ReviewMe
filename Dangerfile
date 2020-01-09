# Sometimes it's a README fix, or something like that - which isn't relevant for
# including in a project's CHANGELOG for example
declared_trivial = github.pr_title.include? "#trivial"

# Make it more obvious that a PR is a work in progress and shouldn't be merged yet
warn("PR is classed as Work in Progress") if github.pr_title.include? "[WIP]"

# Warn when there is a big PR
warn("Big PR") if git.lines_of_code > 500

# Give a warning if the PR description is empty
warn("Please provide a PR description") if github.pr_body.length < 5

# Give a warning when a PR is over expected size
warn("This PR is quite a big one! Try splitting this into separate tasks next time 🙂") if git.lines_of_code > 500

message("Thank you for your work @#{github.pr_author} 🎉 You might find a few suggestions from me below 😉")


# AndroidLint
android_lint.report_file = "app/build/reports/lint-results-debug.xml"
android_lint.skip_gradle_task = true
android_lint.severity = "Warning"
android_lint.filtering = true
android_lint.lint(inline_mode: true)
